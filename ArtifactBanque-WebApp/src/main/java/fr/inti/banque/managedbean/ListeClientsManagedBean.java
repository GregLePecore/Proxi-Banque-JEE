//package fr.inti.banque.managedbean;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.faces.bean.ManagedBean;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import fr.inti.banque.dao.ClientDaoImpl;
//import fr.inti.banque.dao.IDao;
//import fr.inti.banque.dao.IDaoClient;
//import fr.inti.banque.entities.Client;
//
//@ManagedBean(name="mbListeClients")
//@Scope
//@Component
//public class ListeClientsManagedBean implements Serializable{
//	@Autowired
//	@Qualifier("daoClient")
//	private IDaoClient daoClient;
//	private List<Client> listeTest = new ArrayList<Client>();
//	
//	// GETTERS & SETTERS
//	
//	public List<Client> getListeTest() {
//		System.out.println("Ceci est le GET");
//		listeTest = daoClient.getAll();
////		Client client1=new Client("MOUSE","Mickey","Rue du réservoir",64320,"Mickeyville",64793025);
////		Client client2=new Client("DUCK","Donald","Rue du lampadaire",18640,"Donaldville",3306743);
////		Client client3=new Client("TROUVETOU","Géo","Rue des Lumières",034575,"Donaldville",3306743);
////		listeTest.add(client1);
////		listeTest.add(client2);
////		listeTest.add(client3);
//		return listeTest;
//	}
//	
//	public void setListeTest(List<Client> listeTest) {
//		System.out.println("Ceci est le SET");
//		this.listeTest = listeTest;
//	}
//	
//	public ListeClientsManagedBean() {
//		System.out.println("Ceci est le CONSTRUCTEUR");
//		//this.daoClient=daoClient;
//	}
//	
//	
//}
