package fr.inti.banque.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
	private List<CompteCourant> listeComptesC=new ArrayList<CompteCourant>();
	private List<CompteEpargne> listeComptesE=new ArrayList<CompteEpargne>();
	private List<String> numerosComptes;
	
	public VirementManagedBean() {
	}

	public void doVirement() {

		System.out.println("OH MON DIEU LE GROS VIREMENT !");

		CompteCourant cc1 = serviceCC.obtenirCompteCourantByNumero(numeroCrediteur);
		CompteCourant cc2 = serviceCC.obtenirCompteCourantByNumero(numeroDebiteur);
		CompteEpargne ce1 = serviceCE.obtenirCompteEpargneByNumero(numeroCrediteur);
		CompteEpargne ce2 = serviceCE.obtenirCompteEpargneByNumero(numeroDebiteur);


		if (cc1 != null) {
			if (cc2 != null) {
				serviceCC.virementCompteACompte(cc1, cc2, montant);
			} else if (ce2 != null) {
				serviceCC.virementCompteACompte(cc1, ce2, montant);
			}
		}
		if (ce1 != null) {
			if (cc2 != null) {
				serviceCE.virementCompteACompte(ce1, cc2, montant);
			} else if (ce2 != null) {
				serviceCE.virementCompteACompte(ce1, ce2, montant);
			}
		}
		
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Virement réussi"));
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
	
	public List<CompteCourant> getListeComptesC() {
		listeComptesC=serviceCC.obtenirAllCompteCourant();
		return listeComptesC;
	}

	public void setListeComptesC(List<CompteCourant> listeComptesC) {
		this.listeComptesC = listeComptesC;
	}

	public List<CompteEpargne> getListeComptesE() {
		listeComptesE=serviceCE.obtenirAllCompteEpargne();
		return listeComptesE;
	}

	public void setListeComptesE(List<CompteEpargne> listeComptesE) {
		this.listeComptesE = listeComptesE;
	}

	public List<String> getNumerosComptes() {
		numerosComptes=new ArrayList<String>();
		listeComptesE=serviceCE.obtenirAllCompteEpargne();
		listeComptesC=serviceCC.obtenirAllCompteCourant();
		for(CompteCourant compte1 : listeComptesC) {
			numerosComptes.add(compte1.getNumero());
		}
		for(CompteEpargne compte2 : listeComptesE) {
			numerosComptes.add(compte2.getNumero());
		}
		return numerosComptes;
	}

	public void setNumerosComptes(List<String> numerosComptes) {
		this.numerosComptes = numerosComptes;
	}
	
}
