package com.zemsania.prueba.demo.repository;

import com.zemsania.prueba.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
