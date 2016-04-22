package fr.inti.banque.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import fr.inti.banque.entities.Client;
import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.entities.CompteEpargne;
import fr.inti.banque.service.IServiceClient;
import fr.inti.banque.service.IServiceCompteCourant;
import fr.inti.banque.service.IServiceCompteEpargne;

@Scope
@Controller(value = "virementMB")
public class VirementManagedBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private IServiceCompteCourant serviceCC;
	@Autowired
	private IServiceCompteEpargne serviceCE;

	// NUMEROS A MODIFIER EN STRING
	private String numeroCrediteur;
	private String numeroDebiteur;
	private int montant;

	public VirementManagedBean() {
	}

	public void doVirement() {

		System.out.println("OH MON DIEU LE GROS VIREMENT !");

		// But : R�cup�rer les comptes � partir des num�ros, puis appeler la
		// m�thode correspondante selon les types de comptes
		// On a un num�roCrediteur, on appelle le serviceCC pour r�cupByNumero,
		// si on a rien on appelle l'autre, si y'a rien le num�ro est faux
		// Same pour l'autre num�ro, et apr�s on appelle la m�thode
		// correspondante

		// Pour l'instant : test avec uniquement des comptes courants, r�cup�r�s
		// par ID

		// TODO : Les m�thodes obtenirCompteCourantById : A modifer avec
		// getByNumero

//		CompteCourant cc1 = serviceCC.obtenirCompteCourantByNumero(numeroCrediteur);
//		CompteCourant cc2 = serviceCC.obtenirCompteCourantByNumero(numeroDebiteur);
//		CompteEpargne ce1 = serviceCE.obtenirCompteEpargneByNumero(numeroCrediteur);
//		CompteEpargne ce2 = serviceCE.obtenirCompteEpargneByNumero(numeroDebiteur);
//
//		if (cc1 != null) {
//			if (cc2 != null) {
//				serviceCC.virementCompteACompte(cc1, cc2, montant);
//			} else if (ce2 != null) {
//				serviceCC.virementCompteACompte(cc1, ce2, montant);
//			}
//		}
//
//		if (ce1 != null) {
//			if (cc2 != null) {
//				serviceCE.virementCompteACompte(ce1, cc2, montant);
//			} else if (ce2 != null) {
//				serviceCE.virementCompteACompte(ce1, ce2, montant);
//			}
//		}
//
	}

	// GETTERS & SETTERS

	public String getNumeroCrediteur() {
		return numeroCrediteur;
	}

	public void setNumeroCrediteur(String numeroCrediteur) {
		this.numeroCrediteur = numeroCrediteur;
	}

	public String getNumeroDebiteur() {
		return numeroDebiteur;
	}

	public void setNumeroDebiteur(String numeroDebiteur) {
		this.numeroDebiteur = numeroDebiteur;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

}
