package fr.inti.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@Column(name = "prenom")
	private String prenom;
	@OneToMany(mappedBy = "personne")
	private List<Adresse> adresses;

}
