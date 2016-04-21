package fr.inti.banque.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.banque.dao.IDao;
import fr.inti.banque.dao.IDaoClient;
import fr.inti.banque.daoImpl.ClientDaoImpl;
import fr.inti.banque.entities.Client;
import fr.inti.banque.service.IServiceClient;

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

		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		// IDaoClient clientDao = (IDaoClient) ctx.getBean("daoClient");
		// List<Client> clients = new ArrayList<Client>();

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

		///////////// TEST DU SERVICE//////////////////

		// IServiceClient serviceClient = (IServiceClient)
		// ctx.getBean("serviceClient");
		// List<Client> listeService = new ArrayList<Client>();

		// Get All clients + affichage console
		// listeService = serviceClient.obtenirAllClients();
		// for (Client client : listeService) {
		// System.out.println(client.getId() + client.getNom() +
		// client.getPrenom() + client.getAdresse()
		// + client.getTelephone());
		// }

		// Get Client by Id + affichage console
		// Client clientIdService = serviceClient.obtenirClientById(2);
		// System.out.println("Client get By Id : " + clientIdService.getId() +
		// clientIdService.getNom()
		// + clientIdService.getPrenom() + clientIdService.getAdresse() +
		// clientIdService.getTelephone());

		// Ajout d'un client
		// Client clientAddService = new Client("Service Boy", "Service Baby",
		// "Dans un Service !", 55666, "ServiceVille",
		// 02334510);
		// serviceClient.ajouterClient(clientAddService);

		// Suppression d'un client
		// serviceClient.supprimerClient(13);

		// Modification d'un client
		// Client clientToUpdateService = serviceClient.obtenirClientById(12);
		// clientToUpdateService.setNom("LE BON UPDATE DES FAMILLES DU
		// SERVICE");
		// serviceClient.modifierClient(clientToUpdateService);
	}

}
