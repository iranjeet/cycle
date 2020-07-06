package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Wheels;

@Repository
public class WheelsDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Wheels user) {
		em.persist(user);
		em.flush();
	}
	
	public Wheels getById(Long Id) {
		return em.find(Wheels.class, Id);
	}
	
	public List<Wheels> getAllFaqs(){
		return (List<Wheels>) em.createQuery("from Wheels u").getResultList();
	}
}
