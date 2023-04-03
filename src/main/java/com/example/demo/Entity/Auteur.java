package com.example.demo.Entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Auteur extends Personne {
	@Column
	private String email;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
        name = "auteur_livre",
        joinColumns = @JoinColumn(name = "auteur_id"),
        inverseJoinColumns = @JoinColumn(name = "livre_id"))
    private Set<Livre> livres=new HashSet<>();
	
	
	
	public Auteur(Integer id, String nom, String prenom, String cin, Date dateNaissance, String email,
			Set<Livre> livres) {
		super(id, nom, prenom, cin, dateNaissance);
		this.email = email;
		this.livres = livres;
	}
	
	

	public Auteur() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void addlivre(Livre livre) {
		this.livres.add(livre);
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Livre> getLivres() {
		return livres;
	}
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

}
