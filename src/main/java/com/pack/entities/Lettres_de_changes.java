package com.pack.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;


@Entity
@Table(name = "lettres_de_changes")
public class Lettres_de_changes implements Serializable{

	
	private static final long serialVersionUID = 1L;

	//les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_LC")
	private Integer numero_LC;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_creation")
 	private Date   date_creation;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_echeance")
 	private Date   date_echeance;
	
	@Column(name = "lieu_creation")
	private String lieu_creation;
	
	@Column(name = "montant")
 	private Double montant;
	
	@Column(name = "nom_beneficiaire")
	private String nom_beneficiaire;
	

	@Column(name = "valeur_en")
 	private String valeur_en;
	
	@ManyToOne
	@JoinColumn(name = "id_tireur", referencedColumnName = "id")
	private Informations_entreprise informations_entreprise;
	
	@ManyToOne
	@JoinColumn(name = "id_tire", referencedColumnName = "id_client")
	private Clients clients;
	
	
	@Column(name = "valide")
 	private Boolean valide;
	
	
 	
	
	//constructeur par defaut
	public Lettres_de_changes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//getters and setters
 	public Integer getNumero_LC() {
		return numero_LC;
	}
	public void setNumero_LC(Integer numero_LC) {
		this.numero_LC = numero_LC;
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
	
	
	public Clients getClients() {
		return clients;
	}
	public void setClients(Clients clients) {
		this.clients = clients;
	}
 	
	public Informations_entreprise getInformations_entreprise() {
		return informations_entreprise;
	}
	public void setInformations_entreprise(Informations_entreprise informations_entreprise) {
		this.informations_entreprise = informations_entreprise;
	}
 	
	
}
