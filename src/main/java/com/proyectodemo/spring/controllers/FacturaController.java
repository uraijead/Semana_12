package com.proyectodemo.spring.controllers;

import com.proyectodemo.spring.models.entity.Cliente;
import com.proyectodemo.spring.models.entity.Factura;
import com.proyectodemo.spring.models.services.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FacturaController {

    @Autowired
    private IFacturaService facturaService;

    @GetMapping("/facturas")
    private List<Factura> getAll() {
        return facturaService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/facturas")
    public Factura create(@RequestBody Factura factura) {
        facturaService.save(factura);
        return factura;
    }

}
