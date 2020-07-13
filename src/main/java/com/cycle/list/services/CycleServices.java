package com.cycle.list.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cycle.list.dao.BottomBracketDao;
import com.cycle.list.dao.BrandsDao;
import com.cycle.list.dao.BreakDao;
//import com.cycle.list.dao.CategoriesDao;
import com.cycle.list.dao.ChainDao;
import com.cycle.list.dao.CranksetDao;
import com.cycle.list.dao.DerailleurDao;
import com.cycle.list.dao.CycleDao;
import com.cycle.list.dao.FAQsDao;
import com.cycle.list.dao.FrameMaterialDao;
import com.cycle.list.dao.HandleBarDao;
import com.cycle.list.dao.HubsDao;
import com.cycle.list.dao.ReviewsDao;
import com.cycle.list.dao.SaddleDao;
import com.cycle.list.dao.TyresDao;
//import com.cycle.list.dao.UserDao;
import com.cycle.list.dao.WheelsDao;
import com.cycle.list.domain.Brands;
import com.cycle.list.domain.Cycle;
import com.cycle.list.dto.genericResponce.GenericResponce;
import com.cycle.list.dto.requestDto.AddBrands;
import com.cycle.list.dto.requestDto.RequestCycleDTO;

import javax.transaction.Transactional;


import org.slf4j.Logger;


@Service
@Transactional
public class CycleServices {
	
	@Autowired
	BottomBracketDao bottomBracketDao;
	
	@Autowired
	BrandsDao brandsDao;
	
	@Autowired
	BreakDao breakDao;
	
//	@Autowired
//	CategoriesDao categoriesDao;
	
	@Autowired
	ChainDao chainDao;
	
	@Autowired
	CranksetDao cranksetDao;
	
	@Autowired
	DerailleurDao deraillDao;
	
	@Autowired
	CycleDao cycleDao;
	
	@Autowired
	FAQsDao faQsDao;
	
	@Autowired
	FrameMaterialDao frameMaterialDao;
	
	@Autowired
	HandleBarDao handleBarDao;
	
	@Autowired
	HubsDao hubsDao;
	
	@Autowired
	ReviewsDao reviewsDao;
	
	@Autowired
	SaddleDao saddleDao;
	
	@Autowired
	TyresDao tyresDao;
	
//	@Autowired
//	UserDao userDao;
//	
	@Autowired
	WheelsDao wheelsDao;
	
	private final Logger log = LoggerFactory.getLogger(CycleServices.class);

	public GenericResponce addBrand(AddBrands a) {
		Brands brand=new Brands();
		brandsDao.create(brand);

		GenericResponce responce=new GenericResponce();
		responce.setApiMessage("Brand Added Sucessfully");
		responce.setApiSucessStatus(true);
		responce.setDetails("Reference Brand Name: ");
		log.info("Brand added Sucessfully");		
		return responce;
	}

	public GenericResponce addCycle(RequestCycleDTO add) {
		Cycle cycle=new Cycle();
		
		
		
		
		
		
				

		cycleDao.create(cycle);
		
		GenericResponce responce=new GenericResponce();
		responce.setApiMessage("Brand Added Sucessfully");
		responce.setApiSucessStatus(true);
		responce.setDetails("Reference Brand Name: ");
		log.info("Cycle added Sucessfully");	
		
		return responce;
	}

}
