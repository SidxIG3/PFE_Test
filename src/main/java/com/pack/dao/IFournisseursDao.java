package com.pack.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pack.entities.Fournisseurs;

public interface IFournisseursDao extends JpaRepository<Fournisseurs,Integer> {

}
