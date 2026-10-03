package br.com.fiap.microservices.pedidoservice.service;

import br.com.fiap.microservices.pedidoservice.CatalogoFeignClient;
import br.com.fiap.microservices.pedidoservice.dto.CriarPedidoDTO;
import br.com.fiap.microservices.pedidoservice.feign.ClienteFeignClient;
import br.com.fiap.microservices.pedidoservice.model.Pedido;
import br.com.fiap.microservices.pedidoservice.repository.PedidoRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private static final Logger logger = LoggerFactory.getLogger(PedidoService.class);
    private final PedidoRepository pedidoRepository;
    private final CatalogoFeignClient catalogoFeignClient;
    private final ClienteFeignClient clienteFeignClient;


    public PedidoService(PedidoRepository pedidoRepository,
                         CatalogoFeignClient catalogoFeignClient,
                         ClienteFeignClient clienteFeignClient){
        this.pedidoRepository = pedidoRepository;
        this.catalogoFeignClient = catalogoFeignClient;
        this.clienteFeignClient = clienteFeignClient;
    }

    @Transactional
    public Pedido criar(CriarPedidoDTO dto){
        logger.info("Criando novo pedido para cliente ID: {}", dto.clienteId());

        //1. Validar se o cliente existe(ClienteFeignClient)
        //2. Processar os itens do pedido(CatalogoFeignClient
        //3. Validar estoque
        //4. Criar item do pedido com preço do catálogo
        //5. Calcular o valor total
        //6. Criar e persistir o pedido
        //7. Retornar o Pedido popular com os dados do cliente e dos produtos

        return null;
    }
}
