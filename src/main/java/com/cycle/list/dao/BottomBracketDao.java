package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.BottomBracket;
import com.cycle.list.domain.Cassette;

@Repository
public class BottomBracketDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(BottomBracket user) {
		em.persist(user);
		em.flush();
	}
	
	public BottomBracket getById(Long Id) {
		return em.find(BottomBracket.class, Id);
	}
	
	public List<BottomBracket> getAllUser(){
		return (List<BottomBracket>) em.createQuery("from bottom_bracket u").getResultList();
	}
}
