package com.zemsania.prueba.demo.controller;

import com.zemsania.prueba.demo.model.Cliente;
import com.zemsania.prueba.demo.service.imp.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
        return cliente;
    }

}
