package fr.adopteunchat.dao.jpa;

import java.util.List;

import fr.adopteunchat.dao.IDepartementDao;
import fr.adopteunchat.model.Departement;

public class DepartementDaoJpa extends DaoJpa implements IDepartementDao {

	@Override
	public List<Departement> findAll() {
		List<Departement> departements = em.createQuery("select d from Departement d", Departement.class).getResultList();
		return departements;
	}

	@Override
	public Departement findById(int id) {
		return em.createQuery("select d from Departement d where d.id=?1", Departement.class).setParameter(1, id)
				.getSingleResult();
	}

	@Override
	public Departement add(Departement entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		
		return entity;
	}

	@Override
	public Departement save(Departement entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public boolean deleteById(int id) {
		em.getTransaction().begin();

		em.createQuery("delete from Departement d where d.id=?1").setParameter(1, id).executeUpdate();

		em.getTransaction().commit();

		return true;
	}

}
