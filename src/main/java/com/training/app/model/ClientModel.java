package com.training.app.model;

import com.training.app.controller.error.ConflictException;
import com.training.app.controller.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class ClientModel {
    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(Client client) {
        if (clientRepository.findByName(client.getName()) != null) {
            throw new ConflictException("Another record with the same name exists");
        }
        return clientRepository.insert(client);
    }

    public Client getClientById(String id) {
        try {
            return clientRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            throw new NotFoundException(
                    String.format("No record with id [%s] was found in database", id)
            );
        }
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }
}
