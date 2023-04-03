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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Auteur;
import com.example.demo.Entity.Livre;
import com.example.demo.repository.AuteurRepository;
import com.example.demo.repository.LivreRepository;
import com.example.demo.serviceImpl.LivreImpl;


@RestController
@RequestMapping("/livre")
public class LivreController {

	@Autowired
	LivreImpl impl;
	@Autowired
	LivreRepository livreRepository;
	@Autowired 
	AuteurRepository auteurRepository;
	@PostMapping
	public Livre Save(@RequestBody Livre livre) {
		return impl.Save(livre);
	}
	
	@GetMapping
	public List<Livre> getall(){
		return impl.GetAll();
	}
	
	@PutMapping(path = "/{id}")
	public Livre Update(@PathVariable Integer id,@RequestBody Livre livre) {
		return impl.Update(id, livre);
	}
	
	@DeleteMapping(path = "/{id}")
	public void Delete(@PathVariable Integer id) {
		impl.Delete(id);
	}
	
	@GetMapping(path = "getbydate")
	public List<Livre> GetBetweenTodate(@RequestParam("start-date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@RequestParam("end-date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate){
		return livreRepository.findBydateEditionBetween(startDate, endDate);
	}
	
	
}