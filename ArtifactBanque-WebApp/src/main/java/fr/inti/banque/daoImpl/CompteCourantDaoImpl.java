package fr.inti.banque.daoImpl;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.hibernate.QueryParameterException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.inti.banque.dao.IDaoCompteCourant;
import fr.inti.banque.entities.CompteCourant;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Dao Compte Courant Implémenté. Fonctions CRUD.
 *
 */

@Repository("daoCompteCourant")
@Transactional
@Component
public class CompteCourantDaoImpl implements IDaoCompteCourant {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<CompteCourant> getAll() {
		return getSession().createQuery("from compteCourant").list();
	}

	public CompteCourant getById(int id) {
		CompteCourant cc = (CompteCourant) getSession().get(CompteCourant.class, id);
		return cc;
	}

	public void add(CompteCourant object) {
		getSession().save(object);
	}

	public void deleteById(int id) {
		CompteCourant ccToDelete = this.getById(id);
		getSession().delete(ccToDelete);
	}

	public void update(CompteCourant object) {
		getSession().update(object);
	}

	public CompteCourant getByNumero(String numero) {
		List<CompteCourant> listeCC= getSession().createQuery("from compteCourant c where c.numero=?").setParameter(0, numero).list();
		if(listeCC.isEmpty()){
			return null;
		}
		return listeCC.get(0);

	}	
}
