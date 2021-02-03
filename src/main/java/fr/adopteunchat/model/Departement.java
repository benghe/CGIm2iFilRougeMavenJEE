package fr.adopteunchat.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Departement {
	@Id //OBLIGATOIRE UNE FOIS ET UNE SEULE DANS UNE CLASSE ENTITY
	@GeneratedValue(strategy = GenerationType.IDENTITY) //STRATEGIE D'AUTO-INCREMENT SUR CET ID
	@Column(name="DPT_ID") // OPTIONNEL SI LE NOM DU CHAMP = LE NOM DE L'ATTRIBUT
//	@Column(name="DPT_ID",nullable=false)
	private int id;
	
	@Column(name="DPT_LIBELLE", length=50,nullable=false)
	private String libelle;
	
	@Column(name="DPT_REGION",nullable=false)
	private int region_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

	/**
	 * @param id
	 * @param libelle
	 * @param region_id
	 */
	public Departement(int id, String libelle, int region_id) {
		this.id = id;
		this.libelle = libelle;
		this.region_id = region_id;
	}
	
	
	/**
	 * @param libelle
	 * @param region_id
	 */
	public Departement(String libelle, int region_id) {
		this.libelle = libelle;
		this.region_id = region_id;
	}
	
}
