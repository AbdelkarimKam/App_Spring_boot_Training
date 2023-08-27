package com.training.app.controller;

public interface Operation {
    long getSolde();

    long deposer(long montant);

    long retirer(long montant);
}
