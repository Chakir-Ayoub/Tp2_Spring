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
import com.example.demo.serviceImpl.PersonneImpl;

@SpringBootApplication
public class Tp2SpringApplication implements CommandLineRunner {
	@Autowired
	private AuteurImpl auteurImpl;
	@Autowired
	private LivreImpl livreImpl;
	@Autowired
	private PersonneImpl personneImpl;
	public static void main(String[] args) {
		SpringApplication.run(Tp2SpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		personneImpl.Save(new Personne(null,"Chakir","Ayoub","EE654719",new Date(2023, 8, 24)));
		personneImpl.Save(new Personne(null,"Anas","Naciri","EE658799",new Date(2023, 8, 24)));
		personneImpl.Save(new Personne(null,"Oussama","Bohamidi","EE958799",new Date(2023, 8, 24)));
		personneImpl.Save(new Personne(null,"Yassine","Alaoui","EE328799",new Date(2023, 8, 24)));
		personneImpl.Save(new Personne(null,"Mohmed","Bogerin","EE123799",new Date(2023, 8, 24)));
		
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
		
		
	}

}
