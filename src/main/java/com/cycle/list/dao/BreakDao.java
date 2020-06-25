package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Break;

@Repository
public class BreakDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(Break break1) {
		em.persist(break1);
		em.flush();
	}
	
	public Break getById(Long Id) {
		return em.find(Break.class, Id);
	}
	
	public List<Break> getAllBreaks(){
		
		return (List<Break>) em.createQuery("from break b").getResultList();
		
	}


}
