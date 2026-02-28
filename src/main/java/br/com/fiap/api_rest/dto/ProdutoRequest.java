package br.com.fiap.api_rest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProdutoRequest(
        String nome,
        BigDecimal preco,
        LocalDate expiracao) {
}
