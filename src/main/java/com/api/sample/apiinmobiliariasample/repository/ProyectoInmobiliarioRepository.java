package com.api.sample.apiinmobiliariasample.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sample.apiinmobiliariasample.models.ProyectoInmobiliario;

public interface ProyectoInmobiliarioRepository extends JpaRepository<ProyectoInmobiliario, UUID> {

}
