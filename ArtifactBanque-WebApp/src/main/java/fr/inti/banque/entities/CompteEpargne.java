package fr.inti.banque.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "compteEpargne")
@Table(name = "compte_epargne")
public class CompteEpargne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_compte_epargne")
	private int id;
	@Column(name = "numero")
	private String numero;
	@Column(name = "taux")
	private double taux;
	@Column(name = "solde")
	private double solde;
	@Column(name = "date_ouverture")
	private String dateOuverture;
	@OneToOne
	private Client client;
	@OneToOne
	private VisaPremier visaPremier;
	
	public CompteEpargne(int id, String numero, double taux, double solde, String dateOuverture, Client client, VisaPremier visaPremier) {
		super();
		this.id = id;
		this.numero = numero;
		this.taux = taux;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client = client;
		this.visaPremier = visaPremier;
	}
	
	public CompteEpargne(String numero, double taux, double solde, String dateOuverture, Client client, VisaPremier visaPremier) {
		super();
		this.numero = numero;
		this.taux = taux;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.client = client;
		this.visaPremier = visaPremier;
	}
	
	public CompteEpargne(String numero, double taux, double solde, String dateOuverture) {
		super();
		this.numero = numero;
		this.taux = taux;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public CompteEpargne() {
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

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
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

	public VisaPremier getVisaPremier() {
		return visaPremier;
	}

	public void setVisaPremier(VisaPremier visaPremier) {
		this.visaPremier = visaPremier;
	}
	
}
