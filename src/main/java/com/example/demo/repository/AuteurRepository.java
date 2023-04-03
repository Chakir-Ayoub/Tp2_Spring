package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Auteur;


@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Integer> {
	Auteur findByemail(String email);
}
