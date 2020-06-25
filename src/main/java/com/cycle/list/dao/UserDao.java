package com.cycle.list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cycle.list.domain.User;

@Repository
public class UserDao {

	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(User user) {
		em.persist(user);
		em.flush();
	}
	
	public User getById(Long Id) {
		return em.find(User.class, Id);
	}
	
	public List<User> getAllUser(){
		return (List<User>) em.createQuery("from user u").getResultList();
	}
	
}
