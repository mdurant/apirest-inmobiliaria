package com.api.sample.apiinmobiliariasample.models;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Unidad {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
    private String proyectoInmobiliario;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    private Integer numero;
    @Enumerated(EnumType.STRING)
    private TipoUnidad tipoUnidad;
    private String metraje;
    private Double precio;
    @Enumerated(EnumType.STRING)
    private EstadoUnidad estado;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    public enum TipoUnidad {
        DEPARTAMENTO, CASA, ESTACIONAMIENTO, OTRO
    }

    public enum EstadoUnidad {
        DISPONIBLE, VENDIDO, OTRO
    }
    
}
