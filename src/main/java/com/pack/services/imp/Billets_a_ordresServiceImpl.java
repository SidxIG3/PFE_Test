package com.pack.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.IBillets_a_ordresDao;
import com.pack.entities.Billets_a_ordres;
import com.pack.services.IBillets_a_ordresService;

@Service
@Transactional
public class Billets_a_ordresServiceImpl implements IBillets_a_ordresService {
	@Autowired
	private IBillets_a_ordresDao iBillets_a_ordresDao;

	@Override
	public void ajouterBillets_a_ordres(Billets_a_ordres billets_a_ordres) {
		iBillets_a_ordresDao.save(billets_a_ordres);
	}

	@Override
	public Billets_a_ordres chercherBillets_a_ordresParId(Integer id) {
		return iBillets_a_ordresDao.findById(id).get();

	}

	@Override
	public List<Billets_a_ordres> listerBillets_a_ordres() {
		return iBillets_a_ordresDao.findAll();
		
	}

	@Override
	public void modifierBillets_a_ordres(Billets_a_ordres billets_a_ordres) {
		iBillets_a_ordresDao.save(billets_a_ordres);
	}

	@Override
	public void supprimerBillets_a_ordres(Integer id) {
		iBillets_a_ordresDao.deleteById(id);
		
	}
	
	
	
}
