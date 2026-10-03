package br.com.fiap.microservices.pedidoservice;

import br.com.fiap.microservices.pedidoservice.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "catalogo-service",
        url = "${app.catalogo-service.url}"
)
public interface CatalogoFeignClient {
    @GetMapping("/api/catalogo/produtos/{id}")
    ProdutoDTO buscarProdutoPorId(@PathVariable Long id);
}
