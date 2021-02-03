package fr.adopteunchat.dao.jpa;

import java.util.List;

import fr.adopteunchat.dao.IRegionDao;
import fr.adopteunchat.model.Region;

public class RegionDaoJpa extends DaoJpa implements IRegionDao{

	@Override
	public List<Region> findAll() {
		List<Region> regions = em.createQuery("select r from Region r", Region.class).getResultList();
		return regions;
	}

	@Override
	public Region findById(int id) {
		return em.createQuery("select r from Region r where r.id=?1", Region.class).setParameter(1, id)
				.getSingleResult();
	}

	@Override
	public Region add(Region entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		
		return entity;
	}

	@Override
	public Region save(Region entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public boolean deleteById(int id) {
		em.getTransaction().begin();

		em.createQuery("delete from Region r where r.id.id=?1").setParameter(1, id).executeUpdate();

		em.getTransaction().commit();

		return true;
	}

}
