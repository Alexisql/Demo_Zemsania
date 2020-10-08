package com.zemsania.prueba.demo.service.db;

import com.zemsania.prueba.demo.model.Cliente;
import com.zemsania.prueba.demo.repository.ClienteRepository;
import com.zemsania.prueba.demo.service.imp.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClienteServiceJpa implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente findClienteById(Integer idCliente) {
        Cliente cliente = null;
        Optional<Cliente> option = clienteRepository.findById(idCliente);
        if (option.isPresent()) {
            cliente = option.get();
        }
        return cliente;
    }

}
