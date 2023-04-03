package com.example.demo.Entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String isbn;
	@Column
	private String titre;
	@Column
	private Date dateEdition;
	@JsonIgnore
	@ManyToMany(mappedBy = "livres")
    private Set<Auteur> auteurs=new HashSet<>();
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}
	public Set<Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(Set<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	
}
