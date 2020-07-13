package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.HandleBar;
import com.cycle.list.domain.Tyres;

@Repository
public class TyresDao {
	
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Tyres user) {
		em.persist(user);
		em.flush();
	}
	
	public Tyres getById(Long Id) {
		return em.find(Tyres.class, Id);
	}
	
	public List<Tyres> getAllFaqs(){
		return (List<Tyres>) em.createQuery("from Tyres u").getResultList();
	}

}
