package com.pack.services;

import java.util.List;

import com.pack.entities.Billets_a_ordres;

public interface IBillets_a_ordresService {

	public void ajouterBillets_a_ordres(Billets_a_ordres billets_a_ordres);

	public Billets_a_ordres chercherBillets_a_ordresParId(Integer id);
	
	public List<Billets_a_ordres> listerBillets_a_ordres();
	
	public void modifierBillets_a_ordres(Billets_a_ordres billets_a_ordres);
	
	public void supprimerBillets_a_ordres(Integer id);
}
