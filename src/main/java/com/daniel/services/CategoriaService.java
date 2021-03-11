package com.daniel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.domain.Categoria;
import com.daniel.repositories.CategoriaRepository;
import com.daniel.sertvices.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
		
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = Optional.empty();
		return obj.orElseThrow(() -> new ObjectNotFoundException (
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
}
