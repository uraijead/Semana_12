package com.proyectodemo.spring.models.services;

import com.proyectodemo.spring.models.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IClienteService {
    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public Cliente findById(Long id);
    public void delete(Cliente cliente);
}
