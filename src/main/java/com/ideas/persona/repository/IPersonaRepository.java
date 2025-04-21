package com.ideas.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideas.persona.models.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer>{

}
