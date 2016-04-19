package fr.inti.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name = "agence")
@Table(name = "agences")
public class Agence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_agence")
	private int id;
	@Column(name = "numero")
	private int numero;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "code_postal")
	private int codePostal;
	@Column(name = "ville")
	private String ville;
	@OneToOne
	private Gerant gerant;
	

	public Agence() {
		super();
	}

	public Agence(int numero, String adresse, int codePostal, String ville) {
		super();
		this.numero = numero;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	public Agence(int numero, String adresse, int codePostal, String ville, Gerant gerant) {
		super();
		this.numero = numero;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.gerant = gerant;
	}



	public Agence(int id, int numero, String adresse, int codePostal, String ville, Gerant gerant) {
		super();
		this.id = id;
		this.numero = numero;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.gerant = gerant;
	}
	

	//GETTER & SETTERS
	
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

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

}
