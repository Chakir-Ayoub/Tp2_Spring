package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Personne;


@Repository
public interface PersonneRepository extends JpaRepository<Personne,Integer> {
	Personne findByid(Integer id);
}
