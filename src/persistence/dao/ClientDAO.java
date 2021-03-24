package persistence.dao;

import java.util.List;

import persistence.entities.Client;

public interface ClientDAO {
	
	void add(Client client);
	
	void delete(Client client);
	
	void update(Client client);
	
	List<Client> findAll();
	
	Client findById(int idclient);

}
