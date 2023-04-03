package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Auteur;
import com.example.demo.repository.AuteurRepository;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.service.Dao;

@Service
public class AuteurImpl  {
	
	@Autowired
	AuteurRepository auteurRepository;
	@Autowired
	PersonneRepository personneRepository;
	
	public Auteur Save(Auteur t) {
		// TODO Auto-generated method stub
		Auteur auteur=new Auteur();
		BeanUtils.copyProperties(t, auteur);
		return auteurRepository.save(auteur);
	}

	
	public Auteur Update(String email, Auteur t) {
		// TODO Auto-generated method stub
		Auteur auteur=auteurRepository.findByemail(email);
		if(auteur==null) throw new RuntimeException("Not Found");
		
		auteur.setCin(t.getCin());
		auteur.setDateNaissance(t.getDateNaissance());
		auteur.setEmail(t.getEmail());
		auteur.setNom(t.getNom());
		auteur.setPrenom(t.getPrenom());
		return auteurRepository.save(auteur);
	}

	
	public void Delete(String email) {
		// TODO Auto-generated method stub
		Auteur auteur=auteurRepository.findByemail(email);
		if(auteur==null) throw new RuntimeException("Not Found");
	 auteurRepository.delete(auteur);	
	}

	public Auteur GetById(String email) {
		// TODO Auto-generated method stub
		Auteur auteur=auteurRepository.findByemail(email);
		if(auteur==null) throw new RuntimeException("Not Found");
		return auteur;
	}

	
	public List<Auteur> GetAll() {
		// TODO Auto-generated method stub
		return auteurRepository.findAll();
	}

}
