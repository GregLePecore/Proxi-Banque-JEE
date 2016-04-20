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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author G&G
 * @see Entité Client du projet ProxyBanque. Le client peut posséder un compte
 *      courant ainsi qu'un compte épargne.
 * 
 */
@Entity(name = "client")
@Table(name = "clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_client")
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "code_postal")
	private int codePostal;
	@Column(name = "ville")
	private String ville;
	@Column(name = "telephone")
	private int telephone;
	@ManyToOne
	@JoinColumn(name = "id_conseiller")
	private Conseiller conseiller;
	@OneToOne
	private CompteCourant compteCourant;
	@OneToOne
	private CompteEpargne compteEpargne;

	public Client(int id, String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
			Conseiller conseiller, CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.conseiller = conseiller;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	public Client(String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
			Conseiller conseiller, CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.conseiller = conseiller;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	public Client(String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
			Conseiller conseiller) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.conseiller = conseiller;
	}

	public Client(String nom, String prenom, String adresse, int codePostal, String ville, int telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	public Client() {
		super();
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

}
