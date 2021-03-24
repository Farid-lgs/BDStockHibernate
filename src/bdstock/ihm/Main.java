package bdstock.ihm;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import persistence.dao.DAOCategorie;
import persistence.dao.DAOClient;
import persistence.dao.DAOCommande;
import persistence.dao.DAOProduit;
import persistence.entities.Categorie;
import persistence.entities.Client;
import persistence.entities.Commande;
import persistence.entities.CommandeId;
import persistence.entities.Produit;

public class Main {

	public static void main(String[] args) {
		/*Categorie categorie = new Categorie(new BigDecimal(111),"AAA","BBB",new HashSet<Produit>());
		Produit produit = new Produit(new BigDecimal(111), categorie, "eau", new BigDecimal(5.2), new BigDecimal(4), "bouteille", "cristaline", "bouteille eau", new HashSet<Commande>());
        Client client = new Client(new BigDecimal(111), null, null, "Nicolas", null, null, null, null, null, null, null, null, "00.00.00.00.00", null, null, "test@test.com", new HashSet<Commande>());
        CommandeId cmdId = new CommandeId(produit.getIdproduit(),client.getIdclient());
        Commande cmd = new Commande(cmdId, client, produit);
        
        DAOCategorie daocate = new DAOCategorie();
        daocate.add(categorie);
        
        DAOProduit daoprod = new DAOProduit();
        daoprod.add(produit);
        
        DAOClient daocli = new DAOClient();
        daocli.add(client);
        
        DAOCommande daocmd = new DAOCommande();
        daocmd.add(cmd);*/
		
		DAOCommande daocmd = new DAOCommande();
		List<Commande> list = daocmd.findAll();
		for(Commande cc : list) {
			CommandeId cid = cc.getId();
			System.out.println("idclient = "+cid.getIdclient()+" idproduit = "+cid.getIdproduit());
		}
	}

}
