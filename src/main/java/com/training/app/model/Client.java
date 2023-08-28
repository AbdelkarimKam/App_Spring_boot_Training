package com.training.app.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "Name is required")
    @Size(min = 3)
    private String name;
    @NotNull(message = "Compte is required")
    private Compte compte;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
