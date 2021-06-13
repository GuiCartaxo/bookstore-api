package com.guilherme.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.bookstore.domain.Categoria;
import com.guilherme.bookstore.dtos.CategoriaDTO;
import com.guilherme.bookstore.repositories.CategoriaRepository;
import com.guilherme.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria findById(Integer id) {

		Optional<Categoria> obj = categoriaRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll() {
		
		return categoriaRepository.findAll();
	}
	
	public Categoria create(Categoria obj) {
		
		obj.setId(null);
		
		return categoriaRepository.save(obj);
	}

	public Categoria update(Integer id, CategoriaDTO objDto) {

		Categoria obj = findById(id);
		
		obj.setNome(objDto.getNome());
		obj.setDescricao(objDto.getDescricao());
		
		return categoriaRepository.save(obj);
	}
}
