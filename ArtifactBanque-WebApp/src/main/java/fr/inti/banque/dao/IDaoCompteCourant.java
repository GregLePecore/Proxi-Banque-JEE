package fr.inti.banque.dao;

import java.util.List;

import fr.inti.banque.entities.CompteCourant;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Interface du Dao CompteCourant
 *
 */
public interface IDaoCompteCourant {

	List<CompteCourant> getAll();
	CompteCourant getById(int id);
	void add(CompteCourant object);
	void deleteById(int id);
	void update(CompteCourant object);
}
