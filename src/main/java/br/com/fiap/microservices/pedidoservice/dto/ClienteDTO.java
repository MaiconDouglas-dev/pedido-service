package br.com.fiap.microservices.pedidoservice.dto;

public record ClienteDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        String endereco,
        Boolean ativo
) {
}
