package fr.inti.banque.dao;

import java.util.List;

import fr.inti.banque.entities.CompteEpargne;

/**
 * 
 * @author El Grande Geoffrey
 * 
 * @see Interface du Dao CompteEpargne
 *
 */
public interface IDaoCompteEpargne {
	List<CompteEpargne> getAll();

	CompteEpargne getById(int id);

	void add(CompteEpargne object);

	void deleteById(int id);

	void update(CompteEpargne object);
}
