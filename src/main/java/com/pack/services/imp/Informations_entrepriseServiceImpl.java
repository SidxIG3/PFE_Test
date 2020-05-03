package com.pack.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pack.dao.IInformations_entrepriseDao;
import com.pack.entities.Informations_entreprise;
import com.pack.services.IInformations_entrepriseService;

@Service
public class Informations_entrepriseServiceImpl implements IInformations_entrepriseService {

	@Autowired
	private IInformations_entrepriseDao iInformations_entrepriseDao;

	@Override
	public List<Informations_entreprise> listerInformations_entreprise() {
		return iInformations_entrepriseDao.findAll();
	}
	
	
	@Override
	public void ajouterInformations_entreprise(Informations_entreprise informations_entreprise) {
		iInformations_entrepriseDao.save(informations_entreprise);
		
	}

	@Override
	public Informations_entreprise chercherInformations_entrepriseParId(Integer id) {
		return iInformations_entrepriseDao.findById(id).get();
	}

	

	@Override
	public void modifierInformations_entreprise(Informations_entreprise informations_entreprise) {
		
		iInformations_entrepriseDao.save(informations_entreprise);	
			
	}

	@Override
	public void supprimerInformations_entreprise(Integer id) {
		iInformations_entrepriseDao.deleteById(id);		
		
	}

	

}
