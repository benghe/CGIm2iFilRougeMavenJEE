package fr.adopteunchat.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DaoJpa {
	protected static EntityManagerFactory emf; // Singleton
	protected EntityManager em;

	public DaoJpa() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("AdopteUnChatUnit");

		}

		em = emf.createEntityManager();
	}

}
