package com.rhuan.service;

import com.rhuan.domain.entity.Pedido;
import com.rhuan.domain.enums.StatusPedido;
import com.rhuan.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizarStatus(Integer id, StatusPedido statusPedido);
}
