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

import com.ideas.persona.models.Pais;
import com.ideas.persona.repository.IPaisRepository;

@Service
public class PaisService{
	
	@Autowired
	private IPaisRepository paisRepository;

	public List<Pais> findAll() {
		return paisRepository.findAll();
	}


	public <S extends Pais> S save(S entity) {
		return paisRepository.save(entity);
	}


	public Optional<Pais> findById(int id) {
		return paisRepository.findById(id);
	}


	
}
