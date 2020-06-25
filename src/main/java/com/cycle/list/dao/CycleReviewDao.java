package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.CycleReview;

@Repository
public class CycleReviewDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(CycleReview break1) {
		em.persist(break1);
		em.flush();
	}
	
	public CycleReview getById(Long Id) {
		return em.find(CycleReview.class, Id);
	}
	
	public List<CycleReview> getAllBreaks(){
		
		return (List<CycleReview>) em.createQuery("from Cycle_Review b").getResultList();
		
	}

	
}
