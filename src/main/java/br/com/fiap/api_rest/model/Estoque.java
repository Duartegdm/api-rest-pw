package br.com.fiap.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Estoque {
    @Id
    private UUID id;

    private int quantidade;
}
