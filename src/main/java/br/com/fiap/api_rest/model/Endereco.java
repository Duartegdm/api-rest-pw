package br.com.fiap.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Endereco {
    @Id
    private UUID id;

    private String logradouro;

    private int numero;

    private String complemento;

    private String cidade;

    private String bairro;

    private String estado;

    private String cep;
}
