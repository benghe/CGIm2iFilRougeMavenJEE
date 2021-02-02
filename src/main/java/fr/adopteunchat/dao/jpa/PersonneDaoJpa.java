package fr.adopteunchat.dao.jpa;

import java.util.List;

import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.model.Personne;

public class PersonneDaoJpa extends DaoJpa implements IPersonneDao {

	@Override
	public List<Personne> findAll() {
		List<Personne> personnes = em.createQuery("select p from Personne p", Personne.class).getResultList();
		return personnes;
	}

	@Override
	public Personne findById(int id) {
		return em.createQuery("select p from Personne p where p.id=?1", Personne.class).setParameter(1, id)
				.getSingleResult();
	}
	
	@Override
	public Personne findByEmail(String email) {
		return em.createQuery("select p from Personne p where p.mail=?1", Personne.class).setParameter(1, email)
				.getSingleResult();
	}

	@Override
	public Personne add(Personne entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public Personne save(Personne entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public boolean deleteById(int id) {
		em.getTransaction().begin();

		em.createQuery("delete from Personne p where p.id=?1").setParameter(1, id).executeUpdate();

		em.getTransaction().commit();

		return true;
	}

}
