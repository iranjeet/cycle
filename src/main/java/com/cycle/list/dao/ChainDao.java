package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Cassette;
import com.cycle.list.domain.Chain;

@Repository
public class ChainDao {
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Chain user) {
		em.persist(user);
		em.flush();
	}
	
	public Chain getById(Long Id) {
		return em.find(Chain.class, Id);
	}
	
	public List<Chain> getAllChain(){
		return (List<Chain>) em.createQuery("from Chain u").getResultList();
	}
}
