package fr.inti.banque.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.inti.banque.dao.IDaoCompteCourant;
import fr.inti.banque.dao.IDaoCompteEpargne;
import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.entities.CompteEpargne;
import fr.inti.banque.service.IServiceCompteEpargne;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Implémentation du service Compte Epargne.
 *
 */
@Service("serviceCompteEpargne")
@Component
public class ServiceCompteEpargneImpl implements IServiceCompteEpargne {

	@Autowired
	private IDaoCompteEpargne daoCompteEpargne;
	
	@Autowired
	private IDaoCompteCourant daoCompteCourant;

	public List<CompteEpargne> obtenirAllCompteEpargne() {
		return daoCompteEpargne.getAll();
	}

	public CompteEpargne obtenirCompteEpargneById(int id) {
		return daoCompteEpargne.getById(id);
	}

	public void ajouterCompteEpargne(CompteEpargne object) {
		daoCompteEpargne.add(object);
	}

	public void supprimerCompteEpargne(int id) {
		daoCompteEpargne.deleteById(id);
	}

	public void modifierCompteEpargne(CompteEpargne object) {
		daoCompteEpargne.update(object);
	}

	public void virementCompteACompte(CompteEpargne ceEmetteur, CompteEpargne ceRecepteur, double montant) {
		if(ceEmetteur.getSolde() > montant){
			ceEmetteur.setSolde(ceEmetteur.getSolde() - montant);
			ceRecepteur.setSolde(ceRecepteur.getSolde() + montant);
			daoCompteEpargne.update(ceEmetteur);
			daoCompteEpargne.update(ceRecepteur);
		}
		else {
			System.out.println("T'as pas les sous négro !");
		}
	}

	public CompteEpargne obtenirCompteEpargneByNumero(String numero) {
		return daoCompteEpargne.getByNumero(numero);
	}

	public void virementCompteACompte(CompteEpargne ceEmetteur, CompteCourant ccRecepteur, double montant) {
		if(ceEmetteur.getSolde() > montant){
			ceEmetteur.setSolde(ceEmetteur.getSolde() - montant);
			ccRecepteur.setSolde(ccRecepteur.getSolde() + montant);
			daoCompteEpargne.update(ceEmetteur);
			daoCompteCourant.update(ccRecepteur);
		}
		else {
			System.out.println("T'as pas les sous négro !");
		}
	}
}
