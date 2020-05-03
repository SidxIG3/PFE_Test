package com.pack.controllers;

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

import com.pack.services.imp.ClientsServiceImpl;
import com.pack.services.imp.Informations_entrepriseServiceImpl;
import com.pack.services.imp.Lettres_de_changesServiceImpl;
import com.pack.entities.Informations_entreprise;
import com.pack.entities.Lettres_de_changes;
import com.pack.entities.Fournisseurs;
import com.pack.entities.Billets_a_ordres;
import com.pack.entities.Clients;
import com.pack.services.imp.*;


@Controller 
public class Billets_a_ordresControllers {

	@Autowired
	private Billets_a_ordresServiceImpl billets_a_ordresServiceImpl;

	@Autowired
	private FournisseursServiceImpl fournisseursServiceImpl;
	
	@Autowired
	private Informations_entrepriseServiceImpl informations_entrepriseServiceImpl;
	
	
	

	@GetMapping(value="/AjouterBillets")
	public String ajouterletter(Model model) 
	{
		Billets_a_ordres billets_a_ordres = new Billets_a_ordres();
		
		model.addAttribute("billets_a_ordres", billets_a_ordres);
		
		List<Fournisseurs> fournisseurs = fournisseursServiceImpl.listerFournisseurs();
		
		model.addAttribute("fournisseurs", fournisseurs);
		
		List<Informations_entreprise> informations_entreprise = informations_entrepriseServiceImpl.listerInformations_entreprise();
		
		model.addAttribute("informations_entreprise", informations_entreprise);

		return "AjouterBillet";
	}
	
	//@RequestMapping(value="/enregistrerUtilisateur", method = RequestMethod.GET)
		@PostMapping(value="/enregistrerBillet")
		public String ajouterBillet(Model model, Billets_a_ordres billets_a_ordres) {
		
			Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
			System.out.println(currentTimeStamp);
			billets_a_ordres.setDate_creation(currentTimeStamp);
			
			billets_a_ordresServiceImpl.ajouterBillets_a_ordres(billets_a_ordres);
			
			return "redirect:/Billet"; 
		}
		
		@RequestMapping(value = "/modifierBillets/{id}", method = {RequestMethod.PUT ,RequestMethod.GET})
		public String modifierBillets(Model model, @PathVariable(name = "id") Integer id) {
			
			List<Informations_entreprise> informations_entreprise = informations_entrepriseServiceImpl.listerInformations_entreprise();
			model.addAttribute("informations_entreprise", informations_entreprise);
			
			List<Fournisseurs> fournisseurs = fournisseursServiceImpl.listerFournisseurs();
			model.addAttribute("fournisseurs", fournisseurs);
			
			Billets_a_ordres billets_a_ordres = billets_a_ordresServiceImpl.chercherBillets_a_ordresParId(id);
			model.addAttribute("billets_a_ordres", billets_a_ordres);	
			
			return "ModifierBillet";
		}
		
	
	//liste des utilisateurs
		@GetMapping(value="/Billet")
		public String listerBillet(Model model) {
			
			List<Billets_a_ordres> billets_a_ordres = billets_a_ordresServiceImpl.listerBillets_a_ordres();
			model.addAttribute("billets_a_ordres", billets_a_ordres);
			
			return "Lesbillets_a_ordres";
		} 
		
		//@RequestMapping("/spprimerUtilisateurs/{id}")
		@RequestMapping(value = "/spprimerbillet/{id}", method = {RequestMethod.DELETE ,RequestMethod.GET})
		public String spprimerbillet(@PathVariable(name = "id") Integer id) {
			billets_a_ordresServiceImpl.supprimerBillets_a_ordres(id);;
			
			return "redirect:/Billet";		
		}
		
		//la date
		@InitBinder
		private void initBinder(WebDataBinder binder) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    dateFormat.setLenient(false);
		    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	
	
		}
}
