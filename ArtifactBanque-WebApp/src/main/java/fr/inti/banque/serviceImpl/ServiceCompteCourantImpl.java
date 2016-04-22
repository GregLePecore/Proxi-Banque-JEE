package fr.inti.banque.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.inti.banque.dao.IDaoCompteCourant;
import fr.inti.banque.dao.IDaoCompteEpargne;
import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.entities.CompteEpargne;
import fr.inti.banque.service.IServiceCompteCourant;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Implémentation du service Compte Courant.
 *
 */
@Service("serviceCompteCourant")
@Component
public class ServiceCompteCourantImpl implements IServiceCompteCourant {

	@Autowired
	private IDaoCompteCourant daoCompteCourant;
	
	@Autowired
	private IDaoCompteEpargne daoCompteEpargne;

	public List<CompteCourant> obtenirAllCompteCourant() {
		return daoCompteCourant.getAll();
	}

	public CompteCourant obtenirCompteCourantById(int id) {
		return daoCompteCourant.getById(id);
	}

	public void ajouterCompteCourant(CompteCourant object) {
		daoCompteCourant.add(object);
	}

	public void supprimerCompteCourant(int id) {
		daoCompteCourant.deleteById(id);
	}

	public void modifierCompteCourant(CompteCourant object) {
		daoCompteCourant.update(object);
	}

	public void virementCompteACompte(CompteCourant ccEmetteur, CompteCourant ccRecepteur, double montant) {
		if(ccEmetteur.getSolde() > montant){
			ccEmetteur.setSolde(ccEmetteur.getSolde() - montant);
			ccRecepteur.setSolde(ccRecepteur.getSolde() + montant);
			daoCompteCourant.update(ccEmetteur);
			daoCompteCourant.update(ccRecepteur);
		}
		else {
			System.out.println("T'as pas les sous négro !");
		}
	}

	public CompteCourant obtenirCompteCourantByNumero(String numero) {
		return daoCompteCourant.getByNumero(numero);
	}

	public void virementCompteACompte(CompteCourant ccEmetteur, CompteEpargne ceRecepteur, double montant) {
		if(ccEmetteur.getSolde() > montant){
			ccEmetteur.setSolde(ccEmetteur.getSolde() - montant);
			ceRecepteur.setSolde(ceRecepteur.getSolde() + montant);
			daoCompteCourant.update(ccEmetteur);
			daoCompteEpargne.update(ceRecepteur);
		}
		else {
			System.out.println("T'as pas les sous négro !");
		}
		
	}
}
