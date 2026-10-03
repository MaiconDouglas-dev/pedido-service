package br.com.fiap.microservices.pedidoservice.feign;

import br.com.fiap.microservices.pedidoservice.dto.ClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "cliente-service",
        url = "${app.cliente-service.url}"
)
public interface ClienteFeignClient {
    @GetMapping("/api/clientes/{id}")
    ClienteDTO buscarClientePorId(@PathVariable Long id);
}
