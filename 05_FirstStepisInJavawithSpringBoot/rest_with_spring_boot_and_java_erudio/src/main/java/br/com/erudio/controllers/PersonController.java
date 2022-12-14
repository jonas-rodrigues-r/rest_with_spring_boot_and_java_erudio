package br.com.erudio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.data.vo.v1.PersonVO;
import br.com.erudio.services.PersonServices;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {


	@Autowired
	private PersonServices service;

	@GetMapping(value = "/{id}")
	public PersonVO findById(@PathVariable(value = "id") Long id) throws Exception {

		return service.findById(id);

	}

	@PostMapping
	public PersonVO create(@RequestBody PersonVO person) throws Exception{

		return service.create(person);
	}

	@PutMapping
	public PersonVO update(@RequestBody PersonVO person) throws Exception{

		return service.update(person);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> Delet(@PathVariable(value = "id") Long id) {

		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping
	public List<PersonVO> findAll() throws Exception {

		return service.findAll();

	}



}
