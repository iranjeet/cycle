package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Saddle;

@Repository
public class SaddleDao {
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Saddle user) {
		em.persist(user);
		em.flush();
	}
	
	public Saddle getById(Long Id) {
		return em.find(Saddle.class, Id);
	}
	
	public List<Saddle> getAllFaqs(){
		return (List<Saddle>) em.createQuery("from Saddle u").getResultList();
	}
}
