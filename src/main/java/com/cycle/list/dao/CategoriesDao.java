//package com.cycle.list.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//
//import com.cycle.list.domain.Categories;
//
//
//@Repository
//public class CategoriesDao {
//	@PersistenceContext(unitName = "application")
//	EntityManager em;
//	
//	public void create(Categories user) {
//		em.persist(user);
//		em.flush();
//	}
//	
//	public Categories getById(Long Id) {
//		return em.find(Categories.class, Id);
//	}
//	
//	public List<Categories> getAllChain(){
//		return (List<Categories>) em.createQuery("from Categories u").getResultList();
//	}
//
//}
