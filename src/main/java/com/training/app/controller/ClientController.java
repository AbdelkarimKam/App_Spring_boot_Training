package com.training.app.controller;

import com.training.app.model.Client;
import com.training.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banque")
public class ClientController {

    @Autowired
    private ClientService clientService; // bean

    // TODO: 27/08/2023 envoie objet client et return ce client en response
    @PostMapping(value = "/client/{name}")
    public ResponseEntity<Client> createClientByName(@PathVariable String name) {
        return ResponseEntity.ok(clientService.createClientByName(name));
    }

    @GetMapping("/client")
    public ResponseEntity<Client> getClientById(@RequestParam long id) {
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getClients() {
        return ResponseEntity.ok(clientService.getClients());
    }
}
