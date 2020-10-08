package com.zemsania.prueba.demo.controller;

import com.zemsania.prueba.demo.model.Cliente;
import com.zemsania.prueba.demo.model.Venta;
import com.zemsania.prueba.demo.service.imp.IClienteService;
import com.zemsania.prueba.demo.service.imp.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private IVentaService ventaService;

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Venta saveCliente(@RequestBody Venta venta) {
        System.out.println("***************** " + venta.getCliente());
        //Cliente cliente = clienteService.findClienteById(venta.getCliente().getIdCliente());
        venta.setFecha(new Date());
        //venta.setCliente(cliente);
        System.out.println("***************** " + venta.toString());
        ventaService.saveVenta(venta);
        return venta;
    }

    @GetMapping("/get/{id}")
    public Venta show(@PathVariable Integer id) {
        return ventaService.findVentaById(id);
    }
}
