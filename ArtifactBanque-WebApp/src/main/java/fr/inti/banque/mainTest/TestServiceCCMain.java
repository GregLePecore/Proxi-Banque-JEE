package fr.inti.banque.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.banque.dao.IDaoCompteCourant;
import fr.inti.banque.entities.Client;
import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.service.IServiceClient;
import fr.inti.banque.service.IServiceCompteCourant;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Classe main pour les tests locaux du service Compte Courant (CC).
 *
 */
public class TestServiceCCMain {

	public static void main(String[] args) {

		/**
		 * Tests du service Compte Courant
		 */

		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		// IServiceCompteCourant ccService = (IServiceCompteCourant)
		// ctx.getBean("serviceCompteCourant");
		// IServiceClient serviceClient = (IServiceClient)
		// ctx.getBean("serviceClient");
		// List<CompteCourant> comptesCourants = new ArrayList<CompteCourant>();
		//
		//
		// // Get All comptes courants + affichage console
		// comptesCourants = ccService.obtenirAllCompteCourant();
		// for (CompteCourant cc : comptesCourants) {
		// System.out.println(cc.getId() + cc.getDateOuverture() +
		// cc.getNumero() + cc.getSolde() + cc.getDecouvert());
		// }
		//
		// // Get Compte Courant by Id + affichage console
		// CompteCourant ccId = ccService.obtenirCompteCourantById(2);
		// System.out.println("Compte Courant get By Id : " + ccId.getId() +
		// ccId.getDateOuverture() + ccId.getNumero()
		// + ccId.getSolde() + ccId.getDecouvert());
		//
		// // Ajout d'un compte courant
		// CompteCourant ccAdd = new CompteCourant("99999999", 1500.0, 666.0,
		// "La bonne date du service");
		// ccService.ajouterCompteCourant(ccAdd);
		//
		// // Suppression d'un compte courant
		// //ccService.supprimerCompteCourant(8);
		//
		// // Modification d'un compte courant
		// CompteCourant ccToUpdate = ccService.obtenirCompteCourantById(7);
		// ccToUpdate.setDateOuverture("Service Updated");
		// ccService.modifierCompteCourant(ccToUpdate);
		//
		// // Virement compte à compte
		// Client c1 = serviceClient.obtenirClientById(1);
		// Client c2 = serviceClient.obtenirClientById(2);
		//
		// ccService.virementCompteACompte(c1.getCompteCourant(),
		// c2.getCompteCourant(), 2);

	}

}
