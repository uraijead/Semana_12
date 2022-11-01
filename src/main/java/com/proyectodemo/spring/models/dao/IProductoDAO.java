package com.proyectodemo.spring.models.dao;

import com.proyectodemo.spring.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDAO extends JpaRepository<Producto, Long> {
}
