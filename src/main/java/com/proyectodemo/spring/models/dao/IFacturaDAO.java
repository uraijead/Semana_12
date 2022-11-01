package com.proyectodemo.spring.models.dao;

import com.proyectodemo.spring.models.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaDAO extends JpaRepository<Factura, Long> {
}
