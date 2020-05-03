package com.pack.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "Fournisseurs")
public class Fournisseurs implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;

	//les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fournisseur")
	private Integer id_fournisseur;
	
	@Column(name = "nom_fournisseur")
	private String  nom_fournisseur;
	
	@Column(name = "pays")
	private String pays;
	
	@Column(name = "ville")
	private String ville;
	
	@Column(name = "adresse")
	private String adresse;
	
	@Column(name = "code_postal")
	private String code_postal;
	
	@Column(name = "telephone")
	private Integer telephone;
	
	@Column(name = "fax")
	private Integer fax;
	
	@Column(name = "email")
	private String  email;
	
	@Column(name = "site_web")
	private String site_web;
	
	@Column(name = "logo")
	private String logo;
	
	@Column(name = "devise_principale")
	private String devise_principale;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_compte") private Comptes comptes;
	 */
	
	@OneToMany(mappedBy = "fournisseurs")
	private List<Billets_a_ordres> billets_a_ordres;
	
	
	//constructeur par defaut
	public Fournisseurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//getters and setters
	
	public Integer getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(Integer id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	
	
	public String getNom_fournisseur() {
		return nom_fournisseur;
	}
	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}
	
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	
	
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	
	
	public Integer getFax() {
		return fax;
	}
	public void setFax(Integer fax) {
		this.fax = fax;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getSite_web() {
		return site_web;
	}
	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}
	
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
	public String getDevise_principale() {
		return devise_principale;
	}
	public void setDevise_principale(String devise_principale) {
		this.devise_principale = devise_principale;
	}
	
	
	public List<Billets_a_ordres> getBillets_a_ordres() {
		return billets_a_ordres;
	}
	public void setBillets_a_ordres(List<Billets_a_ordres> billets_a_ordres) {
		this.billets_a_ordres = billets_a_ordres;
	}
	
	
	/*
	 * public Comptes getComptes() { return comptes; } public void
	 * setComptes(Comptes comptes) { this.comptes = comptes; }
	 */
	

	
}

