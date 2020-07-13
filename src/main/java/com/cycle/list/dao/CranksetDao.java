package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Crankset;

@Repository
public class CranksetDao {
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Crankset user) {
		em.persist(user);
		em.flush();
	}
	
	public Crankset getById(Long Id) {
		return em.find(Crankset.class, Id);
	}
	
	public List<Crankset> getAllCrankset(){
		return (List<Crankset>) em.createQuery("from Crankset u").getResultList();
	}
}
