package com.ideas.persona.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas.persona.models.Pais;
import com.ideas.persona.service.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisController {
	
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	private ResponseEntity<List<Pais>> getallPaises(){
		return ResponseEntity.ok(paisService.findAll());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Optional<Pais>> getPaisesById(@PathVariable("id") int id){
		return ResponseEntity.ok(paisService.findById(id));
	}

}
