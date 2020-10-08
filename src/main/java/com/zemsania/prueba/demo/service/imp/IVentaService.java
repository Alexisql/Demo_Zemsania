package com.zemsania.prueba.demo.service.imp;

import com.zemsania.prueba.demo.model.Venta;

public interface IVentaService {

    void saveVenta(Venta venta);

    Venta findVentaById(Integer idVenta);
}
