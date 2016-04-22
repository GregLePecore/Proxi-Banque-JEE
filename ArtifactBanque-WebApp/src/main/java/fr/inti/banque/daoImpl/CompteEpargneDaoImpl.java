package fr.inti.banque.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.inti.banque.dao.IDaoCompteEpargne;
import fr.inti.banque.entities.CompteCourant;
import fr.inti.banque.entities.CompteEpargne;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Dao Compte Epargne Implémenté. Fonctions basiques du CRUD.
 *
 */

@Repository("daoCompteEpargne")
@Transactional
@Component
public class CompteEpargneDaoImpl implements IDaoCompteEpargne {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<CompteEpargne> getAll() {
		return getSession().createQuery("from compteEpargne").list();
	}

	public CompteEpargne getById(int id) {
		CompteEpargne ce = (CompteEpargne) getSession().get(CompteEpargne.class, id);
		return ce;
	}

	public void add(CompteEpargne object) {
		getSession().save(object);
	}

	public void deleteById(int id) {
		CompteEpargne ceToDelete = this.getById(id);
		getSession().delete(ceToDelete);
	}

	public void update(CompteEpargne object) {
		getSession().update(object);
	}

	public CompteEpargne getByNumero(String numero) {
		List<CompteEpargne> listeCE= getSession().createQuery("from compteEpargne c where c.numero=?").setParameter(0, numero).list();
		return listeCE.get(0);
	}

}
