package fr.inti.banque.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.banque.entities.Client;
import fr.inti.banque.entities.CompteEpargne;
import fr.inti.banque.service.IServiceClient;
import fr.inti.banque.service.IServiceCompteEpargne;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Classe main pour les tests locaux du service Compte Epargne (CE).
 *
 */
public class TestServiceCEMain {

	public static void main(String[] args) {

		/**
		 * Tests du service Compte Epargne
		 */

		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		// IServiceCompteEpargne ceService = (IServiceCompteEpargne)
		// ctx.getBean("serviceCompteEpargne");
		// IServiceClient serviceClient = (IServiceClient)
		// ctx.getBean("serviceClient");
		// List<CompteEpargne> comptesEpargnes = new ArrayList<CompteEpargne>();
		//
		// // Get All comptes epargnes + affichage console
		// comptesEpargnes = ceService.obtenirAllCompteEpargne();
		// for (CompteEpargne ce : comptesEpargnes) {
		// System.out.println(ce.getId() + ce.getDateOuverture() +
		// ce.getNumero() + ce.getSolde() + ce.getTaux());
		// }
		//
		// // Get Compte Epargne by Id + affichage console
		// CompteEpargne ceId = ceService.obtenirCompteEpargneById(2);
		// System.out.println("Compte Epargne get By Id : " + ceId.getId() +
		// ceId.getDateOuverture() + ceId.getNumero()
		// + ceId.getSolde() + ceId.getTaux());
		//
		// // Ajout d'un compte Epargne
		// CompteEpargne ceAdd = new CompteEpargne("0123456789", 0.2, 5000.0,
		// "La doute d'ouvirtoure");
		// ceService.ajouterCompteEpargne(ceAdd);
		//
		// // Suppression d'un compte Epargne
		// //ceService.supprimerCompteEpargne(7);
		//
		// // Modification d'un compte courant
		// CompteEpargne ceToUpdate = ceService.obtenirCompteEpargneById(5);
		// ceToUpdate.setDateOuverture("SERVICE WAS HERE");
		// ceService.modifierCompteEpargne(ceToUpdate);
		//
		// // Virement compte à compte Epargne
		// Client c1 = serviceClient.obtenirClientById(1);
		// Client c2 = serviceClient.obtenirClientById(3);
		//
		// ceService.virementCompteACompte(c1.getCompteEpargne(),
		// c2.getCompteEpargne(), 1000);

	}

}
