package com.pack.services;

import java.util.List;

import com.pack.entities.Informations_entreprise;

public interface IInformations_entrepriseService {

	public void ajouterInformations_entreprise(Informations_entreprise informations_entreprise);

	public Informations_entreprise chercherInformations_entrepriseParId(Integer id);
	
	public List<Informations_entreprise> listerInformations_entreprise();
	
	public void modifierInformations_entreprise(Informations_entreprise informations_entreprise);
	
	public void supprimerInformations_entreprise(Integer id);
}
