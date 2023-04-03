package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Auteur;
import com.example.demo.repository.AuteurRepository;
import com.example.demo.serviceImpl.AuteurImpl;

import jakarta.persistence.criteria.CriteriaBuilder.In;



@RestController
@RequestMapping("/auteur")
public class AuteurController {
	
	@Autowired
	AuteurImpl auteurImpl;
	
	@Autowired
	AuteurRepository auteurRepository;
	
	@PostMapping
	public Auteur Save(@RequestBody Auteur auteur) {
		
		return auteurImpl.Save(auteur);
	}
	
	@GetMapping
	public List<Auteur> getAll()
	{
		return auteurImpl.GetAll();
	}
	
	@DeleteMapping(path = "/{id}")
	public void Delete(@PathVariable Integer id) {
		auteurImpl.Delete(id);
	}
	
	
	@PutMapping(path = "/{id}")
	public Auteur Update(@PathVariable Integer id,@RequestBody Auteur auteur) {
		return auteurImpl.Update(id, auteur);
	}
	
	@GetMapping(path = "getbycin/{cin}")
	public Auteur GetByCin(@PathVariable String cin) {
		return auteurRepository.findBycin(cin);
	}
	
	@GetMapping(path = "/getbydate/{dateNaissance}")
	public Auteur GetByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateNaissance) {
		return auteurRepository.findBydateNaissance(dateNaissance);
	}
}
