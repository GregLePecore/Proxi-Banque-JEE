package fr.inti.banque.dao;

import java.util.List;

import fr.inti.banque.entities.Client;

/**
 * 
 * @author El Grande Geoffrey
 * @see Interface du Dao Client
 *
 */
public interface IDaoClient{

	List<Client> getAll();
	Client getById(int id);
	void add(Client object);
	void deleteById(int id);
	void update(Client object);
}
