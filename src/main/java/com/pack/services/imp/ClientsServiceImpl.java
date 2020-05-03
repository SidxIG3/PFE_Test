package com.pack.services.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.IClientsDao;
import com.pack.entities.Clients;
import com.pack.services.IClientsService;

@Service
@Transactional
public class ClientsServiceImpl implements IClientsService {
	@Autowired
	private IClientsDao dao;

	@Override
	public void ajouterClients(Clients clients) {
		
		dao.save(clients);
		
	}

	@Override
	public Clients chercherClientsParId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Clients> listerClients() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void modifierClients(Clients client) {
		
		dao.save(client);
		
	}

	@Override
	public void supprimerClients(Integer id) {
		
		dao.deleteById(id);
		
	}

	public IClientsDao getDao() {
		return dao;
	}

	public void setDao(IClientsDao dao) {
		this.dao = dao;
	}
	
}
