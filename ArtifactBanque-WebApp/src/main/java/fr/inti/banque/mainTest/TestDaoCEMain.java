package fr.inti.banque.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.banque.dao.IDaoCompteCourant;
import fr.inti.banque.dao.IDaoCompteEpargne;
import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.entities.CompteEpargne;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Classe main pour les tests locaux du dao et du service Compte Epargne
 *      (CE).
 *
 */
public class TestDaoCEMain {

	public static void main(String[] args) {

		/**
		 * Test du DAO Compte Epargne
		 **/

		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		// IDaoCompteEpargne ceDao = (IDaoCompteEpargne)
		// ctx.getBean("daoCompteEpargne");
		// List<CompteEpargne> comptesEpargnes = new ArrayList<CompteEpargne>();
		//
		// // Get All comptes epargnes + affichage console
		// comptesEpargnes = ceDao.getAll();
		// for (CompteEpargne ce : comptesEpargnes) {
		// System.out.println(ce.getId() + ce.getDateOuverture() +
		// ce.getNumero() + ce.getSolde() + ce.getTaux());
		// }
		//
		// // Get Compte Epargne by Id + affichage console
		// CompteEpargne ceId = ceDao.getById(2);
		// System.out.println("Compte Epargne get By Id : " + ceId.getId() +
		// ceId.getDateOuverture() + ceId.getNumero()
		// + ceId.getSolde() + ceId.getTaux());
		//
		// // Ajout d'un compte Epargne
		// CompteEpargne ceAdd = new CompteEpargne("0123456789", 0.2, 5000.0,
		// "La doute d'ouvirtoure");
		// ceDao.add(ceAdd);
		//
		// // Suppression d'un compte Epargne
		// //ceDao.deleteById(6);
		//
		// // Modification d'un compte courant
		// CompteEpargne ceToUpdate = ceDao.getById(5);
		// ceToUpdate.setDateOuverture("La date de l'epargne avec Cerise");
		// ceDao.update(ceToUpdate);
		
		/**
		 * Tests du service Compte Epargne
		 */
		

	}

}
