package com.ideas.persona.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.ideas.persona.models.Persona;
import com.ideas.persona.repository.IPersonaRepository;

@Service
public class PersonaService{
	
	@Autowired
	private IPersonaRepository personaRepository;

	public List<Persona> findAllPersonas() {
		return personaRepository.findAll();
	}	

	public void deleteById(Integer id) {
		personaRepository.deleteById(id);
		
	}

	public void delete(Persona entity) {
		personaRepository.delete(entity);
		
	}

	public Persona guardarPersona(Persona persona) {
		personaRepository.save(persona);
		return null;
	}

}
