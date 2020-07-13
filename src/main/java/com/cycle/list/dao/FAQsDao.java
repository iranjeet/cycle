package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Crankset;
import com.cycle.list.domain.FAQs;

@Repository
public class FAQsDao {
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(FAQs user) {
		em.persist(user);
		em.flush();
	}
	
	public FAQs getById(Long Id) {
		return em.find(FAQs.class, Id);
	}
	
	public List<FAQs> getAllFaqs(){
		return (List<FAQs>) em.createQuery("from FAQs u").getResultList();
	}
}
