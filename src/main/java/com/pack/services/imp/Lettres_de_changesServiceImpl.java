package com.pack.services.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.ILettres_de_changesDao;
import com.pack.entities.Lettres_de_changes;
import com.pack.services.ILettres_de_changesService;

@Service
@Transactional
public class Lettres_de_changesServiceImpl implements ILettres_de_changesService {
	@Autowired
	private ILettres_de_changesDao iLettres_de_changesDao;

	@Override
	public void ajouterLettres_de_changes(Lettres_de_changes lettres_de_changes) {
		
		iLettres_de_changesDao.save(lettres_de_changes);
	}

	@Override
	public Lettres_de_changes chercherLettres_de_changesParId(Integer id) {
		
		return iLettres_de_changesDao.findById(id).get();
	
	}

	@Override
	public List<Lettres_de_changes> listerLettres_de_changes() {
		return iLettres_de_changesDao.findAll();
	}

	@Override
	public void modifierLettres_de_changes(Lettres_de_changes lettres_de_changes) {
		iLettres_de_changesDao.save(lettres_de_changes);	

	}

	@Override
	public void supprimerLettres_de_changes(Integer id) {
		iLettres_de_changesDao.deleteById(id);
	}

}
