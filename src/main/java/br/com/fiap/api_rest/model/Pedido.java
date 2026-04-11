package br.com.fiap.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TD_PEDIDOS")
public class Pedido {
    @Id
    private UUID id;

    private LocalDate data;

    private List<Produto> produtos;

    private float valor;
}
