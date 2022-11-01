package com.proyectodemo.spring.controllers;

import com.proyectodemo.spring.models.entity.Cliente;
import com.proyectodemo.spring.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    private List<Cliente> getAll() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente cliente(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente create(@RequestBody Cliente cliente) {
        clienteService.save(cliente);
        return cliente;
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Cliente clienteDelete = clienteService.findById(id);
        clienteService.delete(clienteDelete);
    }
}
