package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.FrameMaterial;

@Repository
public class FrameMaterialDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;

	public void create(FrameMaterial break1) {
		em.persist(break1);
		em.flush();
	}
	
	public FrameMaterial getById(Long Id) {
		return em.find(FrameMaterial.class, Id);
	}
	
	public List<FrameMaterial> getAllBreaks(){
		
		return (List<FrameMaterial>) em.createQuery("from Frame_Material b").getResultList();
		
	}

}
