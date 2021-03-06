package fr.adopteunchat.service;

import java.util.List;

import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.dao.sql.PersonneDaoSql;
import fr.adopteunchat.model.Personne;

public class PersonneService {
	
	IPersonneDao daoPersonne = new PersonneDaoSql();
	
	
	public List<Personne> findAll() {
		
		return daoPersonne.findAll();

	}
	
	public Personne findById(int id) {
		
		if (id!=0) {
			return daoPersonne.findById(id);
		}
		
		return null;
		
	}
	
	public Personne add(Personne entity) {
		
		//Check if entity not null
		if(entity.getNom()==null) {
			return null;
		}
		
		//Type Check if equals Adoptant ou Refuge
		boolean Type = false;
		if(entity.getType().equals("Adoptant") || entity.getType().equals("Refuge")) {
			Type=true;
		}
		
		
		// DateNaissance format check
		String DateNaissance=entity.getDateNaissance();
		Boolean DateNaissanceCheck=false;
		Character char1=DateNaissance.charAt(4);
		Character char2=DateNaissance.charAt(7);
		
		if(char1.equals('-') && char2.equals('-')) {
			DateNaissanceCheck=true;
		}
		
		if(!entity.getNom().equals("") && entity.getPassword().length()>=6 && Type && DateNaissanceCheck) {
			return daoPersonne.add(entity);
		}
		
		return null;
	}
	

}
