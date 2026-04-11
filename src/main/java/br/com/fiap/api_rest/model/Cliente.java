package br.com.fiap.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    private String cpf;

    private String nome;

    private String email;

    private LocalDate dataNascimento;

    private String Telefone;
}
