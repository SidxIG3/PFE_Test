package com.pack.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.entities.Informations_entreprise;

import com.pack.services.imp.*;
@Controller
public class Infornation_enterpriseControllers {

	@Autowired
	private Informations_entrepriseServiceImpl informations_entrepriseServiceImpl;

	@GetMapping(value="/AjouterEN")
	public String ajouterEN(Model model) 
	{
		Informations_entreprise informations_entreprise = new Informations_entreprise();
		model.addAttribute("informations_entreprise", informations_entreprise);

	
		
		return "AjouterEN";
	}
		
	 
	@PostMapping(value="/enregistrerEN")
	public String enregistrerEN(Model model, Informations_entreprise informations_entreprise) {
	
		informations_entrepriseServiceImpl.ajouterInformations_entreprise(informations_entreprise);
		
		return "redirect:/liste";
	}
		
	
	@GetMapping(value = "/liste")
	public String liste(Model model) {
		
		List<Informations_entreprise> informations_entreprise = informations_entrepriseServiceImpl.listerInformations_entreprise();
		model.addAttribute("informations_entreprise", informations_entreprise);
		
		return "listeEN";		
	} 
	@RequestMapping(value = "/modifierEN/{id}", method = {RequestMethod.PUT ,RequestMethod.GET})
	public String modifierEN(Model model, @PathVariable(name = "id") Integer id) {
        Informations_entreprise informations_entreprise = informations_entrepriseServiceImpl.chercherInformations_entrepriseParId(id);
		model.addAttribute("informations_entreprise",informations_entreprise);
		return "ModifierEN";		
	}
	
	//Supprimer
	@RequestMapping("/spprimerEN/{id}")
	public String spprimerUtilisateurs(@PathVariable(name = "id") Integer id) {
		informations_entrepriseServiceImpl.supprimerInformations_entreprise(id);
		
		return "redirect:/liste";		
	}
	
}
