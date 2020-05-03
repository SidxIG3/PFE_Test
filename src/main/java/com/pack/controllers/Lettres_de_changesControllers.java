package com.pack.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pack.entities.Informations_entreprise;
import com.pack.entities.Clients;
import com.pack.entities.Lettres_de_changes;
import com.pack.services.imp.*;

@Controller
public class Lettres_de_changesControllers {

	@Autowired
	private Lettres_de_changesServiceImpl lettres_de_changesServiceImpl;

	@Autowired
	private ClientsServiceImpl clientsServiceImpl;
	
	@Autowired
	private Informations_entrepriseServiceImpl informations_entrepriseServiceImpl;
	
	
	
	@GetMapping(value="/ajouterLettre")
	public String ajouterletter(Model model) 
	{
		Lettres_de_changes lettres_de_changes = new Lettres_de_changes();
		
		model.addAttribute("lettres_de_changes", lettres_de_changes);
		
		List<Clients> clients = clientsServiceImpl.listerClients();
		
		model.addAttribute("clients", clients);
		
		List<Informations_entreprise> informations_entreprise = informations_entrepriseServiceImpl.listerInformations_entreprise();
		
		model.addAttribute("informations_entreprise", informations_entreprise);

		return "AjouterLetter";
	}
	
	//@RequestMapping(value="/enregistrerUtilisateur", method = RequestMethod.GET)
	@PostMapping(value="/enregistrerLetter")
	public String ajouterLetter(Model model, Lettres_de_changes lettres_de_changes) {
		
			Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
			System.out.println(currentTimeStamp);
			lettres_de_changes.setDate_creation(currentTimeStamp);
			lettres_de_changesServiceImpl.ajouterLettres_de_changes(lettres_de_changes);
			
			return "redirect:/Letters"; 
	}
		
		@RequestMapping(value = "/modifierLetter/{id}", method = {RequestMethod.PUT ,RequestMethod.GET})
		public String modifierLetter(Model model, @PathVariable(name = "id") Integer id) {
			
			List<Informations_entreprise> informations_entreprise = informations_entrepriseServiceImpl.listerInformations_entreprise();
			model.addAttribute("informations_entreprise", informations_entreprise);
			
			List<Clients> clients = clientsServiceImpl.listerClients();
			model.addAttribute("clients", clients);
			
			
			Lettres_de_changes lettres_de_changes = lettres_de_changesServiceImpl.chercherLettres_de_changesParId(id);
			model.addAttribute("lettres_de_changes", lettres_de_changes);	
			
			return "ModifierLetter"; 
		}
		
	
	//liste des utilisateurs
		@GetMapping(value="/Letters")
		public String listerUtilisateurs(Model model) {
			
			List<Lettres_de_changes> lettres_de_changes = lettres_de_changesServiceImpl.listerLettres_de_changes();
			model.addAttribute("lettres_de_changes", lettres_de_changes);
			
			return "LesLetterChange";
		} 
		
		//@RequestMapping("/spprimerUtilisateurs/{id}")
		@RequestMapping(value = "/spprimerLetter/{id}", method = {RequestMethod.DELETE ,RequestMethod.GET})
		public String spprimerLetter(@PathVariable(name = "id") Integer id) {
			lettres_de_changesServiceImpl.supprimerLettres_de_changes(id);
			
			return "redirect:/Letters";		
		}
	
	
	
		//la date
		@InitBinder
		private void initBinder(WebDataBinder binder) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    dateFormat.setLenient(false);
		    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}
	
	
	
	
}
