package fr.inti.banque.service;

import java.util.List;

import fr.inti.banque.entities.CompteCourant;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Interface du service CompteCourant. Le service contient le CRUD + la
 *      fonction de virement.
 *
 */
public interface IServiceCompteCourant {

	List<CompteCourant> obtenirAllCompteCourant();

	CompteCourant obtenirCompteCourantById(int id);

	void ajouterCompteCourant(CompteCourant object);

	void supprimerCompteCourant(int id);

	void modifierCompteCourant(CompteCourant object);

	void virementCompteACompte(CompteCourant ccEmetteur, CompteCourant ccRecepteur, double montant);
}
