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

import fr.inti.banque.dao.ClientDaoImpl;
import fr.inti.banque.dao.IDao;
import fr.inti.banque.dao.IDaoClient;
import fr.inti.banque.entities.Client;
import fr.inti.banque.service.IServiceClient;

@Scope
@Controller(value="mbListeClients")
public class ListeClientsManagedBean implements Serializable{
	@Autowired
	private IServiceClient serviceClient;
	private List<Client> clients = new ArrayList<Client>();
	
	// GETTERS & SETTERS
	
	public List<Client> getClients() {
		System.out.println("Ceci est le GET");
		clients = serviceClient.obtenirAllClients();

		return clients;
	}
	
	public void setClients(List<Client> clients) {
		System.out.println("Ceci est le SET");
		this.clients = clients;
	}
	
	public ListeClientsManagedBean() {
		System.out.println("Ceci est le CONSTRUCTEUR");
	}
	
	
}
