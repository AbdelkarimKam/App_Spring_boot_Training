package com.training.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class OperationController implements Operation{

    @Override
    public long getSolde() {
        return 0;
    }

    @Override
    public long deposer(long montant) {
        return 0;
    }

    @Override
    public long retirer(long montant) {
        return 0;
    }
}
