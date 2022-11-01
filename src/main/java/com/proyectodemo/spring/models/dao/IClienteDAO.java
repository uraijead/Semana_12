package com.proyectodemo.spring.models.dao;


import com.proyectodemo.spring.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente, Long> {

}
