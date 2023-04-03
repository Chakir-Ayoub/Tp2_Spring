package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Personne;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.service.Dao;

@Service
public class PersonneImpl implements Dao<Personne> {
	
	@Autowired
	PersonneRepository personneRepository;

	@Override
	public Personne Save(Personne t) {
		// TODO Auto-generated method stub
		return personneRepository.save(t);
	}

	@Override
	public Personne Update(Integer id, Personne t) {
		// TODO Auto-generated method stub
		Personne personne=personneRepository.findByid(id);
		if(personne==null) throw new RuntimeException("Nott Found");
		
		personne.setCin(t.getCin());
		personne.setDateNaissance(t.getDateNaissance());
		personne.setNom(t.getNom());
		personne.setPrenom(t.getPrenom());
		return personneRepository.save(personne);
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		Personne personne=personneRepository.findByid(id);
		if(personne==null) throw new RuntimeException("Not Found");
		personneRepository.delete(personne);
		
	}

	@Override
	public Personne GetById(Integer id) {
		// TODO Auto-generated method stub
		Personne personne=personneRepository.findByid(id);
		if(personne==null) throw new RuntimeException("Not Found");
		return personne;
	}

	@Override
	public List<Personne> GetAll() {
		// TODO Auto-generated method stub
		
		return personneRepository.findAll();
	}
	
}
