package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Derailleur;
import com.cycle.list.domain.HandleBar;

@Repository
public class HandleBarDao {

	
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(HandleBar user) {
		em.persist(user);
		em.flush();
	}
	
	public HandleBar getById(Long Id) {
		return em.find(HandleBar.class, Id);
	}
	
	public List<HandleBar> getAllFaqs(){
		return (List<HandleBar>) em.createQuery("from HandleBar u").getResultList();
	}
}
