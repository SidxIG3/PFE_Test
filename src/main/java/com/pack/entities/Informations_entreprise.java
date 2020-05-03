package com.pack.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name = "Informations_entreprise")
public class Informations_entreprise implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "adresse")
	@NotEmpty
	private String adresse;
	
	@Column(name = "adresse_banque")
	@NotEmpty
	private String  adresse_banque ;
	
	@Column(name = "capital")
	//@NotEmpty
	private Double capital;
	
	@Column(name = "cle_rib")
	//@NotEmpty
	private Integer cle_rib;
	
	@Column(name = "code_banque")
	@NotEmpty
	private String  code_banque;
	
	@Column(name = "code_guichet")
	@NotEmpty
	private String  code_guichet;
	
	
	
	@Column(name = "devise_principale")
	@NotEmpty
	private String devise_principale;
	
	
	@Column(name = "email")
	@NotEmpty
	private String  email;
	

	@Column(name = "fax")
	//@NotEmpty
	private Integer fax;
	
	
	@Column(name = "logo")
	@NotEmpty
	private String logo;
	

	@Column(name = "nom_banque")
	@NotEmpty
	private String  nom_banque;
	
	
	@Column(name = "numero_compte_bancaire")
	//@NotEmpty
	private Integer numero_compte_bancaire;
	
	
	@Column(name = "raison_sociale")
	@NotEmpty
	private String raison_sociale;
	
	
	@Column(name = "site_web")
	@NotEmpty
	private String site_web;
	
	@Column(name = "telephone")
	//@NotEmpty
	private Integer telephone;
	
	
	@Column(name = "type_activite")
	@NotEmpty
	private String type_activite;
	
	
	@Column(name = "ville")
	@NotEmpty
	private String ville;
	
	
	@OneToMany(mappedBy = "informations_entreprise")
	private List<Billets_a_ordres> billets_a_ordres;
	
	@OneToMany(mappedBy = "informations_entreprise")
	private List<Lettres_de_changes> lettres_de_changes;
	
	
	
	//constructeur par defaut
	public Informations_entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getRaison_sociale() {
		return raison_sociale;
	}
	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	
	
	public String getType_activite() {
		return type_activite;
	}
	public void setType_activite(String type_activite) {
		this.type_activite = type_activite;
	}
	
	
	public Double getCapital() {
		return capital;
	}
	public void setCapital(Double capital) {
		this.capital = capital;
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
	
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	

	public String getSite_web() {
		return site_web;
	}
	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}
	
	
	public String getDevise_principale() {
		return devise_principale;
	}
	public void setDevise_principale(String devise_principale) {
		this.devise_principale = devise_principale;
	}
	
	
	public String getCode_banque() {
		return code_banque;
	}
	public void setCode_banque(String code_banque) {
		this.code_banque = code_banque;
	}
	
	
	public String getNom_banque() {
		return nom_banque;
	}
	public void setNom_banque(String nom_banque) {
		this.nom_banque = nom_banque;
	}
	
	
	public String getAdresse_banque() {
		return adresse_banque;
	}
	public void setAdresse_banque(String adresse_banque) {
		this.adresse_banque = adresse_banque;
	}
	
	
	public Integer getCle_rib() {
		return cle_rib;
	}
	public void setCle_rib(Integer cle_rib) {
		this.cle_rib = cle_rib;
	}
	
	
	public Integer getNumero_compte_bancaire() {
		return numero_compte_bancaire;
	}
	public void setNumero_compte_bancaire(Integer numero_compte_bancaire) {
		this.numero_compte_bancaire = numero_compte_bancaire;
	}
	
	
	public String getCode_guichet() {
		return code_guichet;
	}
	public void setCode_guichet(String code_guichet) {
		this.code_guichet = code_guichet;
	}
	
	
	public List<Billets_a_ordres> getBillets_a_ordres() {
		return billets_a_ordres;
	}
	public void setBillets_a_ordres(List<Billets_a_ordres> billets_a_ordres) {
		this.billets_a_ordres = billets_a_ordres;
	}
	
	
	public List<Lettres_de_changes> getLettres_de_changes() {
		return lettres_de_changes;
	}
	public void setLettres_de_changes(List<Lettres_de_changes> lettres_de_changes) {
		this.lettres_de_changes = lettres_de_changes;
	}

}
