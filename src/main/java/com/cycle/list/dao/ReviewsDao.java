package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Reviews;

@Repository
public class ReviewsDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(Reviews break1) {
		em.persist(break1);
		em.flush();
	}
	
	public Reviews getById(Long Id) {
		return em.find(Reviews.class, Id);
	}
	
	public List<Reviews> getAllBreaks(){
		
		return (List<Reviews>) em.createQuery("from Reviews b").getResultList();
		
	}

	
}
