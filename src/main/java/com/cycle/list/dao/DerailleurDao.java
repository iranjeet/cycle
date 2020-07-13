package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Derailleur;


@Repository
public class DerailleurDao {
	
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Derailleur user) {
		em.persist(user);
		em.flush();
	}
	
	public Derailleur getById(Long Id) {
		return em.find(Derailleur.class, Id);
	}
	
	public List<Derailleur> getAllFaqs(){
		return (List<Derailleur>) em.createQuery("from Derailleur u").getResultList();
	}
}
