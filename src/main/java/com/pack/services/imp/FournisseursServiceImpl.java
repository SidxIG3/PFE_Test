package com.pack.services.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.IFournisseursDao;
import com.pack.entities.Fournisseurs;
import com.pack.services.IFournisseursService;

@Service
@Transactional
public class FournisseursServiceImpl implements IFournisseursService {
	@Autowired
	private IFournisseursDao dao;

	@Override
	public void ajouterFournisseurs(Fournisseurs fournisseurs) {
	
		
		dao.save(fournisseurs);
		}

	@Override
	public Fournisseurs chercherFournisseursParId(Integer id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Fournisseurs> listerFournisseurs() {
		return dao.findAll();
	}

	@Override
	public void modifierFournisseurs(Fournisseurs fournisseurs) {
		
		dao.save(fournisseurs);
	}

	@Override
	public void supprimerFournisseurs(Integer id) {
		dao.deleteById(id);
		
	}

	public IFournisseursDao getDao() {
		return dao;
	}

	public void setDao(IFournisseursDao dao) {
		this.dao = dao;
	}
	
}
