package fr.inti.banque.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "conseiller")
@Table(name = "conseillers")
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_conseiller")
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@ManyToOne
	@JoinColumn(name = "id_gerant")
	private Gerant gerant;
	@OneToMany(mappedBy = "conseiller")
	private List<Client> clients = new ArrayList<Client>();

	public Conseiller(String nom, String prenom, List<Client> clients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.clients = clients;
	}

	public Conseiller(String nom, String prenom, Gerant gerant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
	}

	public Conseiller(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Conseiller(String nom, String prenom, Gerant gerant, List<Client> clients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
		this.clients = clients;
	}

	public Conseiller() {
		super();
	}

	public Conseiller(int id, String nom, String prenom, Gerant gerant, List<Client> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
		this.clients = clients;
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

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
