package fr.inti.banque.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import fr.inti.banque.entities.Client;

/**
 * 
 * @author El Grande Geoffrey
 *
 * @see Dao implémenté pour le client. Utilise hibernate + le transactionnal
 *      (notamment pour la suppression) Permet de récupérer tous les clients, de
 *      récupérer un client par son id, d'ajouter un client à la BDD, de
 *      supprimer un client par son ID et de mettre à jour les informations d'un
 *      client.
 */
@Repository("clientDaoBean")
@Transactional
public class ClientDaoImpl implements IDao<Client> {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public List<Client> getAll() {
		return getSession().createQuery("from client").list();
	}

	public Client getById(int id) {
		Client client = (Client)getSession().get(Client.class, id);
		return client;
	}

	public void add(Client object) {
		getSession().save(object);
	}

	public void deleteById(int id) {
		
		Client clientToDelete = this.getById(id);
		getSession().delete(clientToDelete);
	}

	public void update(Client object) {
		getSession().update(object);
	}

}
