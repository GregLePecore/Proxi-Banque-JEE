package fr.inti.banque.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.ServletContextLiveBeansView;

import fr.inti.banque.dao.IDao;
import fr.inti.banque.dao.IDaoClient;
import fr.inti.banque.daoImpl.ClientDaoImpl;
import fr.inti.banque.entities.Client;
import fr.inti.banque.service.IServiceClient;

@Scope
@Controller(value="mbListeClients")
public class ListeClientsManagedBean implements Serializable{
	@Autowired
	private IServiceClient serviceClient;
	private List<Client> clients = new ArrayList<Client>();
	private Client clientAdd=new Client();
	private Client clientSelected=new Client();

	public ListeClientsManagedBean() {
	}
	
	public void addClient() {
		serviceClient.ajouterClient(clientAdd);
	}
	
	public void deleteClient() {
			serviceClient.supprimerClient(clientSelected.getId());
	}
	
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
