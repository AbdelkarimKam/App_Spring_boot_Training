package com.training.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientModel {
    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(Client client) {
        return clientRepository.insert(client);
    }

    public Client getClientByIdFromDatabase(String id) {
        if (clientRepository.findById(id).isEmpty())
            return null;
        return clientRepository.findById(id).get();
    }

    public List<Client> getClientsFromDataBase() {
        return clientRepository.findAll();
    }
}
