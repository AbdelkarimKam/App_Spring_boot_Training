package com.training.app.service;

import com.training.app.model.Client;
import com.training.app.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientModel clientModel;

    public Client createClient(Client client) {
        return clientModel.createClient(client);
    }

    public Client getClientById(String id) {
        return clientModel.getClientById(id);
    }

    public List<Client> getClients() {
        return clientModel.getClients();
    }

    public Client updateClient(Client client) {
        return clientModel.updateClient(client);
    }

    public void deleteClient(String id) {
        clientModel.deleteClient(id);
    }
}
