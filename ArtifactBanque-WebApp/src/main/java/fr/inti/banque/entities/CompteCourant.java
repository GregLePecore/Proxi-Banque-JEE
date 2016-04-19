package fr.inti.banque.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author G&G
 * @see Entité CompteCourant du projet ProxyBanque. Le compte courant est relié à un client et à une carte visaElectron.
 * 
 */
@Entity(name = "compteCourant")
@Table(name = "compte_courant")
public class CompteCourant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_compte_courant")
	private int id;
	@Column(name = "numero")
	private String numero;
	@Column(name = "decouvert")
	private double decouvert;
	@Column(name = "solde")
	private double solde;
	@Column(name = "date_ouverture")
	private String dateOuverture;
	@OneToOne
	private Client client;
	@OneToOne
	private VisaElectron visaElectron;

	
	public CompteCourant(int id, String numero, double decouvert, double solde, String dateOuverture, Client client,
			VisaElectron visaElectron) {
		super();
		this.id = id;
		this.numero = numero;
		this.decouvert = decouvert;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client = client;
		this.visaElectron = visaElectron;
	}

	public CompteCourant(String numero, double decouvert, double solde, String dateOuverture, Client client,
			VisaElectron visaElectron) {
		super();
		this.numero = numero;
		this.decouvert = decouvert;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client = client;
		this.visaElectron = visaElectron;
	}

	public CompteCourant(String numero, double decouvert, double solde, String dateOuverture) {
		super();
		this.numero = numero;
		this.decouvert = decouvert;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public CompteCourant() {
		super();
	}

//	GETTER & SETTERS 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public VisaElectron getVisaElectron() {
		return visaElectron;
	}

	public void setVisaElectron(VisaElectron visaElectron) {
		this.visaElectron = visaElectron;
	}

}
