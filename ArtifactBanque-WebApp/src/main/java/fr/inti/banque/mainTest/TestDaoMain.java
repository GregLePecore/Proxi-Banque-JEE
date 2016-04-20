package fr.inti.banque.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.banque.dao.ClientDaoImpl;
import fr.inti.banque.dao.IDao;
import fr.inti.banque.entities.Client;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Classe de test main pour les fonctionnalités du DAO. Décommentez les
 *      parties à tester.
 *
 */
public class TestDaoMain {
	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		IDao<Client> clientDao = (IDao<Client>) ctx.getBean("clientDaoBean");
		List<Client> clients = new ArrayList<Client>();

		// Get All clients + affichage console
		// clients = clientDao.getAll();
		// for (Client client : clients) {
		// System.out.println(client.getId() + client.getNom() +
		// client.getPrenom() + client.getAdresse()
		// + client.getTelephone());
		// }

		// Get Client by Id + affichage console
		// Client clientId = clientDao.getById(2);
		// System.out.println("Client get By Id : " + clientId.getId() +
		// clientId.getNom() + clientId.getPrenom()
		// + clientId.getAdresse() + clientId.getTelephone());

		// Ajout d'un client
		// Client clientAdd = new Client("Nouveau nom", "Nouveau prénom", "Dans
		// un carton", 55666, "Bouzeville", 02334510);
		// clientDao.add(clientAdd);

		// Suppression d'un client
		// clientDao.deleteById(11);

		// Modification d'un client
		// Client clientToUpdate = clientDao.getById(12);
		// clientToUpdate.setNom("LE BON UPDATE DES FAMILLES TMTC");
		// clientDao.update(clientToUpdate);

	}

}
