package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.CycleBrands;

@Repository
public class CycleBrandsDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(CycleBrands break1) {
		em.persist(break1);
		em.flush();
	}
	
	public CycleBrands getById(Long Id) {
		return em.find(CycleBrands.class, Id);
	}
	
	public List<CycleBrands> getAllBreaks(){
		
		return (List<CycleBrands>) em.createQuery("from cycle_brands b").getResultList();
		
	}

}
