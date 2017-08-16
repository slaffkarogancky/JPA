package kharkov.kp.gic.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import kharkov.kp.gic.domain.Gopnik;

@Repository
public class GopnikRepository {

	@PersistenceContext
	private EntityManager em;

	public void create(Gopnik gopnik) {
		em.persist(gopnik);
	}

	public void update(Gopnik gopnik) {
		em.merge(gopnik);
	}

	public void delete(int gopnikId) {
		Gopnik gopnik = em.find(Gopnik.class, gopnikId);
		if (gopnik != null) {
			em.remove(gopnik);
		}
	}

	public Gopnik getGopnikInfo(int gopnikId) {
		Gopnik gopnik = em.find(Gopnik.class, gopnikId);
		return gopnik;
	}

	public List<Gopnik> getAllGopniks() {
		List<Gopnik> result = em.createQuery("select g from Gopnik g order by g.id ", Gopnik.class).getResultList();
		return result;
	}
}
