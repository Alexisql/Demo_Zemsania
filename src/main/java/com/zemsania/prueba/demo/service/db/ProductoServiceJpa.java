package com.zemsania.prueba.demo.service.db;

import com.zemsania.prueba.demo.model.Producto;
import com.zemsania.prueba.demo.repository.ProductoRepository;
import com.zemsania.prueba.demo.service.imp.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceJpa implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void saveProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findProductoById(Integer idProducto) {
        Producto producto = null;
        Optional<Producto> option = productoRepository.findById(idProducto);
        if (option.isPresent()) {
            producto = option.get();
        }
        return producto;
    }

    @Override
    public void deleteProducto(Integer idProducto) {
        productoRepository.deleteById(idProducto);
    }
}
