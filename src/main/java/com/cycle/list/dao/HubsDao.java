package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.HandleBar;
import com.cycle.list.domain.Hubs;
@Repository
public class HubsDao {
	
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Hubs user) {
		em.persist(user);
		em.flush();
	}
	
	public Hubs getById(Long Id) {
		return em.find(Hubs.class, Id);
	}
	
	public List<Hubs> getAllFaqs(){
		return (List<Hubs>) em.createQuery("from hubs u").getResultList();
	}
}
