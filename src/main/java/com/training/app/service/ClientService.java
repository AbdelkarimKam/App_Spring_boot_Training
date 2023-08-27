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

    public Client createClientByName(String name) {
        return clientModel.createClient(name);
    }

    public Client getClientById(long id) {
        return clientModel.getClientByIdFromDatabase(id);
    }

    public List<Client> getClients() {
        return clientModel.getClientsFromDataBase();
    }
}
