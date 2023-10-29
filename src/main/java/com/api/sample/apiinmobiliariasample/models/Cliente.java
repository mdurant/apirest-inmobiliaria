package com.api.sample.apiinmobiliariasample.models;


import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private UUID id;
    private String rut;
    private String nombre;
    private String correoelectronico;
    private String telefonocontacto;
    private Timestamp fechacreacion;
    private Timestamp createdAt;
    private Timestamp updatedAt; 

}


