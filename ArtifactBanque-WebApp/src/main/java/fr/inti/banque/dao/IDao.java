package fr.inti.banque.dao;

import java.util.List;
/**
 * 
 * @author El Grande Geoffrey
 * 
 * @param <T>  Type � donner � l'interface du DAO
 * 
 * @see Interface g�n�rique pour le DAO. Permet de s'adapter aux diff�rentes entit�s en rempla�ant le <T> par l'entit� souhait�e.
 */
public interface IDao<T> {
	
	List<T> getAll();
	T getById(int id);
	void add(T object);
	void deleteById(int id);
	void update(T object);
}
