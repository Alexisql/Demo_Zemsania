package com.zemsania.prueba.demo.repository;

import com.zemsania.prueba.demo.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
