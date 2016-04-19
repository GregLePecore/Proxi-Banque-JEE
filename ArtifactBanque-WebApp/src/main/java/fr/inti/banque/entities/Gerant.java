package fr.inti.banque.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "gerant")
@Table(name = "gerants")
public class Gerant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_gerant")
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@OneToOne
	private Agence agence;
	@OneToMany(mappedBy = "gerant")
	private List<Conseiller> conseillers = new ArrayList<Conseiller>();

	public Gerant() {
		super();
	}

	public Gerant(int id, String nom, String prenom, Agence agence) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
	}

	public Gerant(String nom, String prenom, Agence agence) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
	}

	public Gerant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Gerant(String nom, String prenom, Agence agence, List<Conseiller> conseillers) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.conseillers = conseillers;
	}

	public Gerant(int id, String nom, String prenom, Agence agence, List<Conseiller> conseillers) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.conseillers = conseillers;
	}

	// GETTERS & SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

}
