package fr.inti.banque.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Transaction;
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
public class ClientDaoImpl extends HibernateDaoSupport implements IDao<Client> {

	public List<Client> getAll() {
		String reqGetAll = "FROM client";
		List<Client> liste = new ArrayList<Client>();
		liste = (List<Client>) getHibernateTemplate().find(reqGetAll);
		return liste;
	}

	public Client getById(int id) {
		String reqById = "FROM client WHERE id=?";
		List<Client> clients = new ArrayList<Client>();
		clients = (List<Client>) getHibernateTemplate().find(reqById, id);
		return clients.get(0);
	}

	public void add(Client object) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().save(object);
	}

	public void deleteById(int id) {
		getHibernateTemplate().setCheckWriteOperations(false);
		Client clientToDelete = this.getById(id);
		getHibernateTemplate().flush();
		getHibernateTemplate().delete(clientToDelete);
		getHibernateTemplate().flush();
	}

	public void update(Client object) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().update(object);
	}

}
