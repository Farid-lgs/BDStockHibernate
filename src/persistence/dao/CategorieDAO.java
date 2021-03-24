package persistence.dao;

import java.util.List;

import persistence.entities.Categorie;

public interface CategorieDAO {
	
	void add(Categorie categorie);
	
	void delete(Categorie categorie);
	
	void update(Categorie categorie);
	
	List<Categorie> findAll();
	
	Categorie findById(int idcateg);
}
