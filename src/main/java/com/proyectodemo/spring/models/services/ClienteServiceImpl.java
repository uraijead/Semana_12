package com.proyectodemo.spring.models.services;

import com.proyectodemo.spring.models.dao.IClienteDAO;
import com.proyectodemo.spring.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDAO clienteDAO;
    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }
    @Override
    public void save(Cliente cliente) {
        clienteDAO.save(cliente);
    }
    @Override
    public Cliente findById(Long id) {
        return clienteDAO.findById(id).orElseThrow(null);
    }
    @Override
    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);
    }
}
