package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.Cassette;

@Repository
public class CassetteDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(Cassette user) {
		em.persist(user);
		em.flush();
	}
	
	public Cassette getById(Long Id) {
		return em.find(Cassette.class, Id);
	}
	
	public List<Cassette> getAllUser(){
		return (List<Cassette>) em.createQuery("from Cassette u").getResultList();
	}
}
