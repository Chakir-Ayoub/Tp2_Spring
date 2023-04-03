package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Auteur;
import com.example.demo.repository.AuteurRepository;
import com.example.demo.service.Dao;

@Service
public class AuteurImpl implements Dao<Auteur> {
	
	@Autowired
	AuteurRepository auteurRepository;
	
	@Override
	public Auteur Save(Auteur t) {
		// TODO Auto-generated method stub
		return auteurRepository.save(t);
	}
	@Override
	public Auteur Update(Integer id, Auteur t) {
		// TODO Auto-generated method stub
		Auteur auteur=auteurRepository.findByid(id);
		if(auteur==null) throw new RuntimeException("Not Found");
		
		auteur.setCin(t.getCin());
		auteur.setDateNaissance(t.getDateNaissance());
		auteur.setEmail(t.getEmail());
		auteur.setNom(t.getNom());
		auteur.setPrenom(t.getPrenom());
		return auteurRepository.save(auteur);
	}
	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		Auteur auteur=auteurRepository.findByid(id);
		if(auteur==null) throw new RuntimeException("Not Found");
		 auteurRepository.delete(auteur);
		
	}
	@Override
	public Auteur GetById(Integer id) {
		// TODO Auto-generated method stub
		Auteur auteur=auteurRepository.findByid(id);
		if(auteur==null) throw new RuntimeException("Not Found");
		return auteur;
	}
	@Override
	public List<Auteur> GetAll() {
		// TODO Auto-generated method stub
		return auteurRepository.findAll();
	}
	


}
