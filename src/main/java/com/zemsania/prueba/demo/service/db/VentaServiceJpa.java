package com.zemsania.prueba.demo.service.db;

import com.zemsania.prueba.demo.model.Venta;
import com.zemsania.prueba.demo.repository.VentaRepository;
import com.zemsania.prueba.demo.service.imp.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VentaServiceJpa implements IVentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public void saveVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public Venta findVentaById(Integer idVenta) {
        Venta venta = null;
        Optional<Venta> option = ventaRepository.findById(idVenta);
        if (option.isPresent()) {
            venta = option.get();
        }
        return venta;
    }
}
