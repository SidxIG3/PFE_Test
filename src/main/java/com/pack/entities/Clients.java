package com.pack.entities;



import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Clients implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	//les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_client")
	private Integer id_client;
	
	@Column(name = "nom_client")
	private String nom_client;
	
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
	
	@Column(name = "code_banque")
	private String  code_banque;
	
	@Column(name = "nom_banque")
	private String  nom_banque;
	
	@Column(name = "adresse_banque")
	private String  adresse_banque ;
	
	@Column(name = "cle_rib")
	private Integer cle_rib;
	
	@Column(name = "numero_compte_bancaire")
	private Integer numero_compte_bancaire;
	
	@Column(name = "code_guichet ")
	private String  code_guichet ;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_compte") private Comptes comptes;
	 */
	
	@OneToMany(mappedBy = "clients")
	private List<Lettres_de_changes> lettres_de_changes;	
	
	
	//constructeur par defaut
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//geters and setters
	
	public Integer getId_client() {
		return id_client;
	}
	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}
	
	
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
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
	
	
	/*
	 * public Comptes getComptes() { return comptes; } public void
	 * setComptes(Comptes comptes) { this.comptes = comptes; }
	 */
	
	

	public List<Lettres_de_changes> getLettres_de_changes() {
		return lettres_de_changes;
	}
	public void setLettres_de_changes(List<Lettres_de_changes> lettres_de_changes) {
		this.lettres_de_changes = lettres_de_changes;
	}
	
	

}

