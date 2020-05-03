package com.pack.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entities.Clients;


public interface IClientsDao extends JpaRepository<Clients,Integer>{

}
