package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.CycleDetails;

@Repository
public class CycleDetailsDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(CycleDetails break1) {
		em.persist(break1);
		em.flush();
	}
	
	public CycleDetails getById(Long Id) {
		return em.find(CycleDetails.class, Id);
	}
	
	public List<CycleDetails> getAllBreaks(){
		
		return (List<CycleDetails>) em.createQuery("from Cycle_Details b").getResultList();
		
	}

}
