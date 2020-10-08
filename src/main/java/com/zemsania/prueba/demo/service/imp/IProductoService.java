package com.zemsania.prueba.demo.service.imp;

import com.zemsania.prueba.demo.model.Producto;

import java.util.List;

public interface IProductoService {

    void saveProducto(Producto producto);

    List<Producto> getProductos();

    Producto findProductoById(Integer idProducto);

    void deleteProducto(Integer idProducto);
}
