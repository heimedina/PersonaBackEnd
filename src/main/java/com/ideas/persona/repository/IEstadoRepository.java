package com.ideas.persona.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideas.persona.models.Estado;
import com.ideas.persona.models.Pais;

public interface IEstadoRepository extends JpaRepository<Estado, Integer>{

	List<Estado> findAllById(int id);
	
	List<Estado> findAllByPais (Optional<Pais> country);
}
