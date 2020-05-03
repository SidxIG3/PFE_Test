package com.pack.services;

import java.util.List;

import com.pack.entities.Lettres_de_changes;

public interface ILettres_de_changesService {

	public void ajouterLettres_de_changes(Lettres_de_changes lettres_de_changes);

	public Lettres_de_changes chercherLettres_de_changesParId(Integer id);
	
	public List<Lettres_de_changes> listerLettres_de_changes();
	
	public void modifierLettres_de_changes(Lettres_de_changes lettres_de_changes);
	
	public void supprimerLettres_de_changes(Integer id);
}
