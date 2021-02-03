package fr.adopteunchat.dao.jpa;

import java.util.List;

import fr.adopteunchat.dao.IRaceDao;
import fr.adopteunchat.model.Race;

public class RaceDaoJpa extends DaoJpa implements IRaceDao{

	@Override
	public List<Race> findAll() {
		List<Race> races = em.createQuery("select r from Race r", Race.class).getResultList();
		return races;
	}

	@Override
	public Race findById(int id) {
		return em.createQuery("select r from Race r where r.id=?1", Race.class).setParameter(1, id)
		.getSingleResult();
	}

	@Override
	public Race add(Race entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public Race save(Race entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public boolean deleteById(int id) {
		em.getTransaction().begin();

		em.createQuery("delete from Race r where r.id=?1").setParameter(1, id).executeUpdate();

		em.getTransaction().commit();
		return false;
	}

}
