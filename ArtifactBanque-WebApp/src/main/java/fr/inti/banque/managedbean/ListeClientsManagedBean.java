package fr.inti.banque.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import fr.inti.banque.entities.Client;
import fr.inti.banque.service.IServiceClient;

@Scope
@Controller(value="mbListeClients")
public class ListeClientsManagedBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private IServiceClient serviceClient;
	private List<Client> clients = new ArrayList<Client>();
	private Client clientAdd=new Client();
	private Client clientSelected;

	public ListeClientsManagedBean() {
	}
	
	public void addClient() {
		serviceClient.ajouterClient(clientAdd);
	}
	
	public void deleteClient() {
			serviceClient.supprimerClient(clientSelected.getId());
	}

//	public void updateClient() {
//			serviceClient.modifierClient(clientSelected);
//	}
	
	// GETTERS & SETTERS
	
	public Client getClientAdd() {
		return clientAdd;
	}
	public void setClientAdd(Client clientAdd) {
		this.clientAdd = clientAdd;
	}
	
	public List<Client> getClients() {
		clients = serviceClient.obtenirAllClients();
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client getClientSelected() {
		return clientSelected;
	}

	public void setClientSelected(Client clientSelected) {
		this.clientSelected = clientSelected;
	}
	
}
