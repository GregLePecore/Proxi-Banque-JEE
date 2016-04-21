package fr.inti.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.inti.banque.dao.IDaoClient;
import fr.inti.banque.entities.Client;

@Service("serviceClient")
@Component
public class ServiceClientImpl implements IServiceClient {

	@Autowired
	private IDaoClient daoClient;

	public List<Client> obtenirAllClients() {
		return daoClient.getAll();
	}

	public Client obtenirClientById(int id) {
		return daoClient.getById(id);
	}

	public void ajouterClient(Client object) {
		daoClient.add(object);
	}

	public void supprimerClient(int id) {
		daoClient.deleteById(id);
	}

	public void modifierClient(Client object) {
		daoClient.update(object);
	}

}
