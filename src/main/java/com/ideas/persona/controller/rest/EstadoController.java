package com.ideas.persona.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas.persona.models.Estado;
import com.ideas.persona.service.EstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoController {

	@Autowired
	private EstadoService estadoService;

	@GetMapping("/{id}")
	private ResponseEntity<List<Estado>> getEstadoById(@PathVariable("id") int idEstado) {
		List<Estado> respuesta = estadoService.findStatusById(idEstado);
		return ResponseEntity.ok(respuesta);
	}

	@GetMapping("/pais/{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByCountry(@PathVariable("id") int idPais) {
		List<Estado> respuesta = estadoService.findAllStatusByCountry(idPais);
		return ResponseEntity.ok(respuesta);
	}

}
