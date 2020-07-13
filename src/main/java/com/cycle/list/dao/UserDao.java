//package com.cycle.list.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//
//import com.cycle.list.constants;
//
//@Repository
//public class UserDao {
//
//	@PersistenceContext(unitName = "application")
//	EntityManager em;
//	
//	public void create(EndUser user) {
//		em.persist(user);
//		em.flush();
//	}
//	
//	public EndUser getById(Long Id) {
//		return em.find(EndUser.class, Id);
//	}
//	
//	public List<EndUser> getAllUser(){
//		return (List<EndUser>) em.createQuery("from user u").getResultList();
//	}
//	
//}
