package com.zemsania.prueba.demo.controller;

import com.zemsania.prueba.demo.model.Producto;
import com.zemsania.prueba.demo.service.imp.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto saveCliente(@RequestBody Producto producto) {
        productoService.saveProducto(producto);
        return producto;
    }

    @GetMapping("/list")
    public List<Producto> listar() {
        return productoService.getProductos();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        productoService.deleteProducto(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto, @PathVariable Integer id) {
        Producto currentProducto = productoService.findProductoById(id);
        currentProducto.setNombre(producto.getNombre());
        currentProducto.setPrecio(producto.getPrecio());
        productoService.saveProducto(producto);
        return currentProducto;
    }

    @GetMapping("/get/{id}")
    public Producto show(@PathVariable Integer id) {
        return productoService.findProductoById(id);
    }

}
