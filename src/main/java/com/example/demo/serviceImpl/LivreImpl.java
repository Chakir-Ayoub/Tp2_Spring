package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Livre;
import com.example.demo.repository.LivreRepository;
import com.example.demo.service.Dao;

@Service
public class LivreImpl implements Dao<Livre> {

	@Autowired
	LivreRepository livreRepository;
	@Override
	public Livre Save(Livre t) {
		// TODO Auto-generated method stub

		return livreRepository.save(t);
	}

	@Override
	public Livre Update(Integer id, Livre t) {
		// TODO Auto-generated method stub
	  Livre livre=livreRepository.findByid(id);
	  if(livre==null) throw new RuntimeException("Not Found");
	  
	  livre.setAuteurs(t.getAuteurs());
	  livre.setDateEdition(t.getDateEdition());
	  livre.setIsbn(t.getIsbn());
	  livre.setTitre(t.getIsbn());
	  
	  return livreRepository.save(livre);
		
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		  Livre livre=livreRepository.findByid(id);
		  if(livre==null) throw new RuntimeException("Not Found");
		  
		  livreRepository.delete(livre);
	}

	@Override
	public Livre GetById(Integer id) {
		// TODO Auto-generated method stub
		  Livre livre=livreRepository.findByid(id);
		  if(livre==null) throw new RuntimeException("Not Found");
		return livre;
	}

	@Override
	public List<Livre> GetAll() {
		// TODO Auto-generated method stub
		
		return livreRepository.findAll();
	}

}
