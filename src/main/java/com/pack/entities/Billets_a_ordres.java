package com.pack.entities;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "billets_a_ordres")
public class Billets_a_ordres implements Serializable {


	private static final long serialVersionUID = 1L;

	//les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_BO")
	private Integer numero_BO;
	
	@ManyToOne
	@JoinColumn(name = "id_tireur", referencedColumnName = "id_fournisseur")
	private Fournisseurs fournisseurs;
	
	@Column(name = "nom_beneficiaire")	
	private String nom_beneficiaire;
	
	@Column(name = "lieu_creation")	
	private String lieu_creation;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_creation")	
 	private Date   date_creation;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_echeance")	
 	private Date   date_echeance;
	
	@Column(name = "montant")	
 	private Double montant;
	
	@Column(name = "valeur_en")	
 	private String valeur_en;
	
	@ManyToOne
	@JoinColumn(name = "id_tire", referencedColumnName = "id")
	private Informations_entreprise informations_entreprise;
	
	@Column(name = "valide")	
 	private Boolean valide;
	
 	
	//constructeur par defaut
 	public Billets_a_ordres() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//getters and setters
	
 	public Integer getNumero_BO() {
		return numero_BO;
	}
	public void setNumero_BO(Integer numero_BO) {
		this.numero_BO = numero_BO;
	}
	
	
	public String getNom_beneficiaire() {
		return nom_beneficiaire;
	}
	public void setNom_beneficiaire(String nom_beneficiaire) {
		this.nom_beneficiaire = nom_beneficiaire;
	}
	
	public String getLieu_creation() {
		return lieu_creation;
	}
	
	public void setLieu_creation(String lieu_creation) {
		this.lieu_creation = lieu_creation;
	}
	
	
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	
	public Date getDate_echeance() {
		return date_echeance;
	}
	public void setDate_echeance(Date date_echeance) {
		this.date_echeance = date_echeance;
	}
	
	
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	
	public String getValeur_en() {
		return valeur_en;
	}
	public void setValeur_en(String valeur_en) {
		this.valeur_en = valeur_en;
	}
	
	
	public Boolean getValide() {
		return valide;
	}
	public void setValide(Boolean valide) {
		this.valide = valide;
	}
	
	
	public Fournisseurs getFournisseurs() {
		return fournisseurs;
	}
	public void setFournisseurs(Fournisseurs fournisseurs) {
		this.fournisseurs = fournisseurs;
	}
	
	
	public Informations_entreprise getInformations_entreprise() {
		return informations_entreprise;
	}
	public void setInformations_entreprise(Informations_entreprise informations_entreprise) {
		this.informations_entreprise = informations_entreprise;
	}
 	
 	
	
	
}
