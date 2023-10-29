package com.api.sample.apiinmobiliariasample.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProyectoInmobiliario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private UUID id;
    private String nombreProyecto;
    private String descripcion;
    private String ubicacion;
    private Date fechaInicio;
    private Date fechaFin;
    
    @Enumerated(EnumType.STRING)
    private EstadoProyecto estado;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    // Enum EstadoProyecto
    public enum EstadoProyecto {
        EN_CONSTRUCCION, TERMINADO, OTRO
    }

	public void setId(UUID id2) {
		// TODO Auto-generated method stub
		
	}
    
    
}
