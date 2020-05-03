package com.pack.services;

import java.util.List;

import com.pack.entities.Fournisseurs;

public interface IFournisseursService {

	public void ajouterFournisseurs(Fournisseurs fournisseurs);

	public Fournisseurs chercherFournisseursParId(Integer id);
	
	public List<Fournisseurs> listerFournisseurs();
	
	public void modifierFournisseurs(Fournisseurs fournisseurs);
	
	public void supprimerFournisseurs(Integer id);
}
