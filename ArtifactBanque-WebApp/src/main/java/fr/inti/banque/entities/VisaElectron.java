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
 * @see Entité VisaElectron du projet ProxyBanque. La carte bancaire VisaElectron est reliée à un compte courant.
 * 
 */
@Entity(name = "visaElectron")
@Table(name = "visa_electron")
public class VisaElectron {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_visa_electron")
	private int id;
	@Column(name = "numero")
	private int numero;
	@Column(name = "date_validite")
	private String dateValidite;
	@Column(name = "pictogramme")
	private int pictogramme;
	@Column(name = "active")
	private boolean active;
	@OneToOne
	private CompteCourant compteCourant;

	public VisaElectron(int id, int numero, String dateValidite, int pictogramme, boolean active,
			CompteCourant compteCourant) {
		super();
		this.id = id;
		this.numero = numero;
		this.dateValidite = dateValidite;
		this.pictogramme = pictogramme;
		this.active = active;
		this.compteCourant = compteCourant;
	}

	public VisaElectron() {
		super();
	}

	public VisaElectron(int numero, String dateValidite, int pictogramme, boolean active, CompteCourant compteCourant) {
		super();
		this.numero = numero;
		this.dateValidite = dateValidite;
		this.pictogramme = pictogramme;
		this.active = active;
		this.compteCourant = compteCourant;
	}

	public VisaElectron(int numero, String dateValidite, int pictogramme, boolean active) {
		super();
		this.numero = numero;
		this.dateValidite = dateValidite;
		this.pictogramme = pictogramme;
		this.active = active;
	}

	// GETTERS & SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(String dateValidite) {
		this.dateValidite = dateValidite;
	}

	public int getPictogramme() {
		return pictogramme;
	}

	public void setPictogramme(int pictogramme) {
		this.pictogramme = pictogramme;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

}
