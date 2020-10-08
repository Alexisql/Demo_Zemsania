package com.zemsania.prueba.demo.repository;

import com.zemsania.prueba.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
