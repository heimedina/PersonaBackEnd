package com.ideas.persona.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas.persona.models.Estado;
import com.ideas.persona.models.Pais;
import com.ideas.persona.repository.IEstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private IEstadoRepository estadoRepository;

	@Autowired
	private PaisService paisService;

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}

	public List<Estado> findAllByCountry(int id) {
		List<Estado> estadosRespuesta = new ArrayList<>();
		List<Estado> estados = estadoRepository.findAll();
		for (int i = 0; i < estados.size(); i++) {
			if (estados.get(i).getPais().getId() == id) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;

	}

	public List<Estado> findAllStatusByCountry(int id) {
		List<Estado> estadosRespuesta = new ArrayList<>();
		Optional<Pais> country = paisService.findById(id);
		if (country.isPresent()) {
			estadosRespuesta = estadoRepository.findAllByPais(country);
		}
		return estadosRespuesta;
	}

	public List<Estado> findStatusById(int id) {
		return estadoRepository.findAllById(id);
	}

}
