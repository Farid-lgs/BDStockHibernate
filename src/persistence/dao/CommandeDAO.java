package persistence.dao;

import java.util.List;
import persistence.entities.Commande;
import persistence.entities.CommandeId;


public interface CommandeDAO {
	
	void add(Commande command);
	
	void delete(Commande command);
	
	void update(Commande command);
	
	List<Commande> findAll();
	
	Commande findById(CommandeId commande);
}
