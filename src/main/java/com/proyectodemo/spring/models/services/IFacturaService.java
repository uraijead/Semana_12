package com.proyectodemo.spring.models.services;

import com.proyectodemo.spring.models.entity.Factura;
import com.proyectodemo.spring.models.entity.Producto;

import java.util.List;

public interface IFacturaService {
    public List<Factura> findAll();
    public Factura save(Factura cliente);
}
