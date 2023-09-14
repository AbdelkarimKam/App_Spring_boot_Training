package com.training.app.controller;

import com.training.app.model.Client;
import com.training.app.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("banque")
public class ClientController {

    @Autowired
    private ClientService clientService; // bean

    @PostMapping("/addClient")
    public ResponseEntity<Client> createClient(@Valid @RequestBody Client client) {
        return new ResponseEntity<>(clientService.createClient(client), HttpStatus.CREATED);
    }

    @GetMapping("/client")
    public ResponseEntity<Client> getClientById(@RequestParam String id) {
        return new ResponseEntity<>(clientService.getClientById(id), HttpStatus.OK);
    }

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getClients() {
        return new ResponseEntity<>(clientService.getClients(), HttpStatus.OK);
    }

    @PutMapping("/client")
    public ResponseEntity<Client> updateClient(@Valid @RequestBody Client client) {
        return new ResponseEntity<>(clientService.updateClient(client), HttpStatus.OK);
    }

    @DeleteMapping("/client")
    public ResponseEntity deleteClient(@RequestParam String id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
