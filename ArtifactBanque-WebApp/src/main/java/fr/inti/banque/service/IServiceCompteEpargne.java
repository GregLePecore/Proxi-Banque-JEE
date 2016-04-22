package fr.inti.banque.service;

import java.util.List;

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

	void ajouterCompteEpargne(CompteEpargne object);

	void supprimerCompteEpargne(int id);

	void modifierCompteEpargne(CompteEpargne object);

	void virementCompteACompte(CompteEpargne ccEmetteur, CompteEpargne ccRecepteur, double montant);
}
