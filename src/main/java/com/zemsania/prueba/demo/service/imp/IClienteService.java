package com.zemsania.prueba.demo.service.imp;

import com.zemsania.prueba.demo.model.Cliente;

public interface IClienteService {

    void saveCliente(Cliente cliente);

    Cliente findClienteById(Integer idCliente);

}
