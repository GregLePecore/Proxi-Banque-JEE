package fr.inti.banque.service;

import java.util.List;

import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.entities.CompteEpargne;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Interface du service CompteEpargne. Le service contient le CRUD + la
 *      fonction de virement.
 *
 */
public interface IServiceCompteEpargne {

	List<CompteEpargne> obtenirAllCompteEpargne();

	CompteEpargne obtenirCompteEpargneById(int id);

	CompteEpargne obtenirCompteEpargneByNumero(String numero);
	
	void ajouterCompteEpargne(CompteEpargne object);

	void supprimerCompteEpargne(int id);

	void modifierCompteEpargne(CompteEpargne object);

	void virementCompteACompte(CompteEpargne ceEmetteur, CompteEpargne ceRecepteur, double montant);
	
	void virementCompteACompte(CompteEpargne ceEmetteur, CompteCourant ccRecepteur, double montant);
}
