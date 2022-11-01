package com.proyectodemo.spring.models.services;

import com.proyectodemo.spring.models.dao.IProductoDAO;
import com.proyectodemo.spring.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public List<Producto> findAll() {
        return productoDAO.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoDAO.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Producto producto) {
        productoDAO.delete(producto);
    }
}
