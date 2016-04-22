package fr.inti.banque.service;

import java.util.List;

import fr.inti.banque.entities.Client;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Interface du service Client.
 *
 */
public interface IServiceClient {

	List<Client> obtenirAllClients();

	Client obtenirClientById(int id);

	void ajouterClient(Client object);

	void supprimerClient(int id);

	void modifierClient(Client object);
}
