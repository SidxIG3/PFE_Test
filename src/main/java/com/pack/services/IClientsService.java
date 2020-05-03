package com.pack.services;

import java.util.List;
import com.pack.entities.Clients;

public interface IClientsService {

	public void ajouterClients(Clients clients);

	public Clients chercherClientsParId(Integer id);
	
	public List<Clients> listerClients();
	
	public void modifierClients(Clients client);
	
	public void supprimerClients(Integer id);
}
