package com.ideas.persona.controller.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas.persona.models.Persona;
import com.ideas.persona.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas(){
		return ResponseEntity.ok(personaService.findAllPersonas());
	}
	
	@PostMapping
	private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
		try {
			Persona personaPersiste = personaService.guardarPersona(persona);
			return ResponseEntity.created(new URI("/personas"+personaPersiste.getId())).body(personaPersiste);
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
