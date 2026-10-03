package br.com.fiap.microservices.pedidoservice.repository;

import br.com.fiap.microservices.pedidoservice.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
