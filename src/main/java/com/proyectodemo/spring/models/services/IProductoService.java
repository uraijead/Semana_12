package com.proyectodemo.spring.models.services;

import com.proyectodemo.spring.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto save(Producto producto);
    public Producto findById(Long id);
    public void delete(Producto cliente);
}
