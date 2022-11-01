package com.proyectodemo.spring.models.services;

import com.proyectodemo.spring.models.dao.IFacturaDAO;
import com.proyectodemo.spring.models.entity.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements IFacturaService{

    @Autowired
    private IFacturaDAO facturaDAO;

    @Override
    public List<Factura> findAll() {
        return facturaDAO.findAll();
    }

    @Override
    public Factura save(Factura factura) {
        return facturaDAO.save(factura);
    }
}
