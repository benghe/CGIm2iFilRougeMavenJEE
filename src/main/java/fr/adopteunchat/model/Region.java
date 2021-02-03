package fr.adopteunchat.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Region {
	@Id //OBLIGATOIRE UNE FOIS ET UNE SEULE DANS UNE CLASSE ENTITY
	@GeneratedValue(strategy = GenerationType.IDENTITY) //STRATEGIE D'AUTO-INCREMENT SUR CET ID
	@Column(name="REGION_ID") // OPTIONNEL SI LE NOM DU CHAMP = LE NOM DE L'ATTRIBUT
//	@Column(name="REGION_ID",nullable=false)
	private int id;
	
	@Column(name="REGION_LIBELLE", length=50,nullable=false)
	private String libelle;

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

	/**
	 * @param id
	 * @param libelle
	 */
	public Region(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}
	
	
	/**
	 	 * @param libelle
	 */
	public Region(String libelle) {
		this.libelle = libelle;
	}
	
	
}
