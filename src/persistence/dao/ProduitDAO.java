package persistence.dao;

import java.util.List;

import persistence.entities.Produit;

public interface ProduitDAO {
	
	void add(Produit produit);
	
	void delete(Produit produit);
	
	void update(Produit produit);
	
	List<Produit> findAll();
	
	Produit findById(int idproduit);

}
