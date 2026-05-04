package com.github.ricardo_almeidas.apir_biblioteca.repository;

import com.github.ricardo_almeidas.apir_biblioteca.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
