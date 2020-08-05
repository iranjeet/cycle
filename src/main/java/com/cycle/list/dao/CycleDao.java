package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Cycle;

@Repository
public class CycleDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(Cycle break1) {
		em.persist(break1);
		em.flush();
	}
	
	public Cycle getById(Long Id) {
		return em.find(Cycle.class, Id);
	}
	
	public List<Cycle> getAllBreaks(){
		
		return (List<Cycle>) em.createQuery("from Cycle b").getResultList();
		
	}
	
	public Object check() {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Cycle> q=cb.createQuery(Cycle.class);
		Root<Cycle> root=q.from(Cycle.class);
		q.select(root);
				
		
		return null;
	}

}
