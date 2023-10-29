package com.api.sample.apiinmobiliariasample.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sample.apiinmobiliariasample.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

}
