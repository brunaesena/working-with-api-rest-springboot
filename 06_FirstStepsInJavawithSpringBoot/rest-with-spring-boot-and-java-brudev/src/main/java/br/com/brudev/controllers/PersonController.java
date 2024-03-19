package br.com.brudev.controllers;

import br.com.brudev.models.Person;
import br.com.brudev.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonServices service;

	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll(){
		return service.findAll();
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person createPerson(@RequestBody Person person){
		return service.createPerson(person);
	}

	@PutMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person updatePerson(@RequestBody Person person){
		return service.updatePerson(person);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable(value = "id") Long id){
		service.deletePerson(id);
		return ResponseEntity.noContent().build();
	}
}
