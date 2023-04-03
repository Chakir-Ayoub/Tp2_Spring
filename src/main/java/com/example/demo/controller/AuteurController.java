package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Auteur;
import com.example.demo.serviceImpl.AuteurImpl;



@RestController
@RequestMapping("/auteur")
public class AuteurController {
	
	@Autowired
	AuteurImpl auteurImpl;
	
	@PostMapping
	public Auteur Save(@RequestBody Auteur auteur) {
		
		return auteurImpl.Save(auteur);
	}
	
	@GetMapping
	public List<Auteur> getAll()
	{
		return auteurImpl.GetAll();
	}
	
	@PutMapping(path = "/{email}")
	public void Delete(@PathVariable String email) {
		auteurImpl.Delete(email);
	}
}
