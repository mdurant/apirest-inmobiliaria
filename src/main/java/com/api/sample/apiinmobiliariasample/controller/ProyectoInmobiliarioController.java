package com.api.sample.apiinmobiliariasample.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.api.sample.apiinmobiliariasample.models.ProyectoInmobiliario;
import com.api.sample.apiinmobiliariasample.repository.ProyectoInmobiliarioRepository;

@RestController
@RequestMapping("api/proyectos-inmobiliarios")

public class ProyectoInmobiliarioController {
	
	@Autowired
	private ProyectoInmobiliarioRepository proyectoRepo;
	
	@PostMapping
	public ProyectoInmobiliario crearProyecto(@RequestBody ProyectoInmobiliario proyecto) {
        return proyectoRepo.save(proyecto);
	}
	
	@PutMapping("/{id}")
    public ProyectoInmobiliario modificarProyecto(@PathVariable UUID id, @RequestBody ProyectoInmobiliario proyecto) {
        if (!proyectoRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Proyecto no encontrado");
        }
        proyecto.setId(id);
        return proyectoRepo.save(proyecto);
    }
	
	@DeleteMapping("/{id}")
    public void eliminarProyecto(@PathVariable UUID id) {
        proyectoRepo.deleteById(id);
    }
	
	//@GetMapping
    // public List<ProyectoInmobiliario> buscarProyectos
    	//	(
    //    @RequestParam(required = false) String nombre,
    //      @RequestParam(required = false) String ubicacion
    //      ) 
	// {
        // Implementar la lógica para buscar proyectos basados en los parámetros proporcionados
   //  }
	
}
