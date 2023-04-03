package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Personne;
import com.example.demo.serviceImpl.PersonneImpl;


@RestController
@RequestMapping("/personne")
public class PersonneController {
	@Autowired
	 PersonneImpl impl;
	
	@PostMapping
	public Personne Save(@RequestBody Personne p) {
		return impl.Save(p);
	}
	
	@GetMapping
	public List<Personne> GetAll() {
		return impl.GetAll();
	}
	
	@PutMapping(path  = "/{id}")
	public Personne Update(@PathVariable Integer id,@RequestBody Personne personne) {
		return impl.Update(id, personne);
	}
	
	@DeleteMapping(path = "/{id}")
	public void Delete( @PathVariable Integer id) {
		 impl.Delete(id);
	}
}
