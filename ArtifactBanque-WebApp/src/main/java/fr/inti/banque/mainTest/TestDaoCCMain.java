package fr.inti.banque.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.banque.dao.IDaoCompteCourant;
import fr.inti.banque.entities.CompteCourant;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Classe main pour les tests locaux du dao et du service Compte Courant
 *      (CC).
 *
 */
public class TestDaoCCMain {

	public static void main(String[] args) {

		/**
		 * Test du DAO Compte Courant
		 **/

		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		// IDaoCompteCourant ccDao = (IDaoCompteCourant)
		// ctx.getBean("daoCompteCourant");
		// List<CompteCourant> comptesCourants = new ArrayList<CompteCourant>();

		// Get All comptes courants + affichage console
		// comptesCourants = ccDao.getAll();
		// for (CompteCourant cc : comptesCourants) {
		// System.out.println(cc.getId() + cc.getDateOuverture() +
		// cc.getNumero() + cc.getSolde() + cc.getDecouvert());
		// }

		// Get Compte Courant by Id + affichage console
		// CompteCourant ccId = ccDao.getById(2);
		// System.out.println("Compte Courant get By Id : " + ccId.getId() +
		// ccId.getDateOuverture() + ccId.getNumero()
		// + ccId.getSolde() + ccId.getDecouvert());

		// Ajout d'un compte courant
		// CompteCourant ccAdd = new CompteCourant("0123456789", 2000.0, 5000.0,
		// "LE CHOIX DANS LA DATE");
		// ccDao.add(ccAdd);

		// Suppression d'un compte courant
		// ccDao.deleteById(6);

		// Modification d'un compte courant
		// CompteCourant ccToUpdate = ccDao.getById(5);
		// ccToUpdate.setDateOuverture("La bonne date pleine de swag");
		// ccDao.update(ccToUpdate);

		/**
		 * Tests du service Compte Courant
		 */

	}

}
