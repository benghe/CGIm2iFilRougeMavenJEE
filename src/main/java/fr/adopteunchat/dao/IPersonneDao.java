package fr.adopteunchat.dao;

import fr.adopteunchat.model.Personne;

public interface IPersonneDao extends IDao<Personne>{

	public Personne findByEmail(String email);

}
