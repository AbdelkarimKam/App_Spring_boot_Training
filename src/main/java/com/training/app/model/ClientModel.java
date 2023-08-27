package com.training.app.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClientModel {
    List<Client> clients = new ArrayList<>();

    {
        // clients de base
        clients.add(new Client(1, "Aziz"));
        clients.add(new Client(2, "Nada"));
        clients.add(new Client(1, "Karim"));
    }

    public Client createClient(String name) {
        Client client = new Client(new Random().nextLong(), name);
        clients.add(client);
        return client;
    }

    public Client getClientByIdFromDatabase(long id) {
        return clients
                .stream()
                .filter(client -> client.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Client> getClientsFromDataBase() {
        return clients;
    }
}
