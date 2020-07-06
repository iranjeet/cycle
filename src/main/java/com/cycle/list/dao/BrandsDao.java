package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Brands;

@Repository
public class BrandsDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(Brands break1) {
		em.persist(break1);
		em.flush();
	}
	
	public Brands getById(Long Id) {
		return em.find(Brands.class, Id);
	}
	
	public List<Brands> getAllBreaks(){
		
		return (List<Brands>) em.createQuery("from brands b").getResultList();
		
	}

}
