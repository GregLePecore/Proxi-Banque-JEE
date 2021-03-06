package fr.inti.banque.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.inti.banque.dao.IDaoClient;
import fr.inti.banque.entities.Client;

/**
 * 
 * @author El Grande Geoffrey
 *
 * @see Dao impl�ment� pour le client. Utilise hibernate + le transactionnal
 *      (notamment pour la suppression) Permet de r�cup�rer tous les clients, de
 *      r�cup�rer un client par son id, d'ajouter un client � la BDD, de
 *      supprimer un client par son ID et de mettre � jour les informations d'un
 *      client.
 */
@Repository("daoClient")
@Transactional
@Component
public class ClientDaoImpl implements IDaoClient {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Client> getAll() {
		System.out.println("ODKZAODKAZODKJOAZKDOAZKDOZAKDOKAZOKDAOZZKDOAKSS");
		return getSession().createQuery("from client").list();
	}

	public Client getById(int id) {
		Client client = (Client) getSession().get(Client.class, id);
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
