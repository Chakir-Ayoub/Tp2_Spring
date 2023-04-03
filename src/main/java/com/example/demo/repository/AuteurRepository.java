package com.example.demo.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Auteur;


@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Integer> {
	Auteur findByemail(String email);
	
	Auteur findByid(Integer id);
	
	Auteur findBycin(String cin);
	
	Auteur findBydateNaissance(Date date);
}
