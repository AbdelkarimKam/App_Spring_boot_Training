package com.training.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Compte {
    private long id;
    private long solde;
    private List<Operation> operations;
}
