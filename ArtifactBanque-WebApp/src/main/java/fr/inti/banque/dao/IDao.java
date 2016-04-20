package fr.inti.banque.dao;

import java.util.List;
/**
 * 
 * @author El Grande Geoffrey
 * 
 * @param <T>  Type à donner à l'interface du DAO
 * 
 * @see Interface générique pour le DAO. Permet de s'adapter aux différentes entités en remplaçant le <T> par l'entité souhaitée.
 */
public interface IDao<T> {
	
	List<T> getAll();
	T getById(int id);
	void add(T object);
	void deleteById(int id);
	void update(T object);
}
