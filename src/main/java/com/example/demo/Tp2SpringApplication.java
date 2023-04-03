package com.example.demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Auteur;
import com.example.demo.Entity.Livre;
import com.example.demo.Entity.Personne;
import com.example.demo.serviceImpl.AuteurImpl;
import com.example.demo.serviceImpl.LivreImpl;

@SpringBootApplication
public class Tp2SpringApplication implements CommandLineRunner {
	@Autowired
	private AuteurImpl auteurImpl;
	@Autowired
	private LivreImpl livreImpl;

	public static void main(String[] args) {
		SpringApplication.run(Tp2SpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Livre l1=new Livre(null,"isbn2","titre2",new Date(2023, 8, 24));
		Livre l2=new Livre(null,"isbn3","titre3",new Date(2023, 8, 24));
		Livre l3=new Livre(null,"isbn4","titre4",new Date(2023, 8, 24));
		Livre l4=new Livre(null,"isbn5","titre5",new Date(2023, 8, 24));
		Livre l5=new Livre(null,"isbn6","titre6",new Date(2023, 8, 24));
		livreImpl.Save(l1);
		livreImpl.Save(l2);
		livreImpl.Save(l3);
		livreImpl.Save(l4);
		livreImpl.Save(l5);
		
		
		auteurImpl.Save(new Auteur(null, "Chakir", "Hamada", "RR111111", new Date(2,2, 2023), "hamasa.chakir@gmail.com",null));
	}

}
