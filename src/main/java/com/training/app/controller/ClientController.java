package com.training.app.controller;

import com.training.app.model.Client;
import com.training.app.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.training.app.controller.tools.Constant.*;

@RestController
@RequestMapping(ROOT + SLASH + CLIENT)
public class ClientController {

    @Autowired
    private ClientService clientService; // bean

    // TODO: 27/08/2023 envoie objet client et return ce client en response
    @PostMapping(value = SLASH)
    public ResponseEntity<Client> createClient(@Valid @RequestBody Client client) {
        return new ResponseEntity<>(clientService.createClient(client), HttpStatus.CREATED);
    }

    @GetMapping(SLASH)
    public ResponseEntity<Client> getClientById(@RequestParam String id) {
        return new ResponseEntity<>(clientService.getClientById(id),HttpStatus.OK);
    }

    @GetMapping(SLASH + CLIENTS)
    public ResponseEntity<List<Client>> getClients() {
        return new ResponseEntity<>(clientService.getClients(),HttpStatus.OK);
    }
}
