package com.training.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Client {
    private long id;
    private String name;
    private Compte compte;

    public Client(long id, String name) {
        this.id=id;
        this.name=name;
    }
}
