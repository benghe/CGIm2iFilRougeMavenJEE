package fr.adopteunchat.dao.jpa;

import java.util.List;

import fr.adopteunchat.dao.IColorDao;
import fr.adopteunchat.model.Color;

public class ColorDaoJpa extends DaoJpa implements IColorDao{

	@Override
	public List<Color> findAll() {
		List<Color> colors = em.createQuery("select c from Color c", Color.class).getResultList();
		return colors;
	}

	@Override
	public Color findById(int id) {
		return em.createQuery("select c from Color c where c.id=?1", Color.class).setParameter(1, id)
				.getSingleResult();
	}

	@Override
	public Color add(Color entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public Color save(Color entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();

		return entity;
	}

	@Override
	public boolean deleteById(int id) {
		em.getTransaction().begin();

		em.createQuery("delete from Color c where c.id=?1").setParameter(1, id).executeUpdate();

		em.getTransaction().commit();

		return true;
	}
	
}
