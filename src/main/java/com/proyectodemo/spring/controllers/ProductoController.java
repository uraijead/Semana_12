package com.proyectodemo.spring.controllers;

import com.proyectodemo.spring.models.entity.Producto;
import com.proyectodemo.spring.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productos")
    private List<Producto> getAll() {
        return productoService.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto producto(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/productos")
    public Producto create(@RequestBody Producto producto) {
        productoService.save(producto);
        return producto;
    }

    @DeleteMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Producto productoDelete = productoService.findById(id);
        productoService.delete(productoDelete);
    }

}
