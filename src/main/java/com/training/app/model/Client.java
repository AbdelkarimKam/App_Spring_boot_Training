package com.training.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Client {
    @Id
    private String id;
    private String name;
    private Compte compte;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
