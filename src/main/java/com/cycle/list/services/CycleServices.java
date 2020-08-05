package com.cycle.list.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cycle.list.dao.BottomBracketDao;
import com.cycle.list.dao.BrandsDao;
import com.cycle.list.dao.BreakDao;
import com.cycle.list.dao.CassetteDao;
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
import com.cycle.list.domain.BottomBracket;
import com.cycle.list.domain.Brands;
import com.cycle.list.domain.Cassette;
import com.cycle.list.domain.Chain;
import com.cycle.list.domain.Cycle;
import com.cycle.list.domain.Derailleur;
import com.cycle.list.domain.FAQs;
import com.cycle.list.dto.genericResponce.GenericResponce;
import com.cycle.list.dto.requestDto.AddBrands;
import com.cycle.list.dto.requestDto.RequestCycleDTO;

import java.util.HashSet;
import java.util.Set;

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
	
	@Autowired
	CassetteDao cassetteDao;
	
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
	
	@Autowired
	DerailleurDao derailleurDao;	
	
	@Autowired
	FAQsDao faqsDao;
	
	
	
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

	public ResponseEntity<Object> addCycle(RequestCycleDTO cycleDto) {
		
		Cycle cycle=new Cycle();
		
		cycle.setName(cycleDto.getName());
		cycle.setFullModelName(cycleDto.getFullModelName());
		cycle.setAddedBy(cycleDto.getAddedBy());
		cycle.setFrameMaterial(cycleDto.getFrameMaterial());
		cycle.setFrontGear(cycleDto.getFrontGear());
		cycle.setRearGear(cycleDto.getRearGear());
		cycle.setGeometry(cycleDto.getGeometry());
		cycle.setFrontWheel(cycleDto.getFrontWheel());
		cycle.setRearWheel(cycleDto.getRearBrake());
		cycle.setRearBreak(cycleDto.getRearBrake());
		cycle.setFrontBreak(cycleDto.getFrontBreak());
		cycle.setImageUrl(cycleDto.getImageUrl());
		cycle.setUpdatedBy(cycleDto.getUpdatedBy());
		cycle.setAddedBy(cycleDto.getAddedBy());
		cycle.setDescription(cycleDto.getDescription());
		cycle.setFrontHubs(cycleDto.getFrontHubs());
		cycle.setRearHubs(cycleDto.getRearHubs());
		cycle.setSaddle(cycleDto.getSaddle());
		cycle.setWheels(cycleDto.getSaddle());
		cycle.setTypeNote(cycleDto.getTypeNote());
		
		if(cycleDto.getRating()>(new Double(5.0)) || cycleDto.getRating()<(new Double(0.0))) {
			log.error("Rating should be between 0.0 and 5.0");
			return ResponseEntity.badRequest().body("Rating should be between 0.0 to 5.0 ");
			}
		else
			cycle.setRating(cycleDto.getRating());
		cycle.setCategories(cycleDto.getCategories());
		cycle.setEndUser(cycleDto.getEndUser());
		cycle.setGender(cycleDto.getGender());
		cycle.setWheelSize(cycleDto.getWheelSize());		
		
		Brands brands=brandsDao.getById(cycleDto.getBrandId());
		cycle.setBrands(brands);
		
		Chain chain =chainDao.getById(cycleDto.getChainId());
		cycle.setChain(chain);
		
		Cassette fCassette=	cassetteDao.getById(cycleDto.getFrontCassetteId());
		cycle.setFrontCassette(fCassette);
		
		Cassette rCassette=cassetteDao.getById(cycleDto.getRearCassetteId());
		cycle.setRearCassette(rCassette);
		
		Derailleur frontDerailleur=deraillDao.getById(cycleDto.getFrontDerailleurId());
		cycle.setFrontDerailleur(frontDerailleur);
		
		Derailleur rearDerailleur=deraillDao.getById(cycleDto.getRearDerailleurId());
		cycle.setRearDerailleur(rearDerailleur);
		
		
		FAQs faQs=faqsDao.getById(cycleDto.getFaQsId());
		cycle.setFaQs((Set<FAQs>) faQs);
		
		Set<Object>  check=new HashSet<>();
		check.add("sdjhjsk");
		System.out.println(check);
		
			

		cycleDao.create(cycle);
		
		GenericResponce responce=new GenericResponce();
		responce.setApiMessage("Cycle Added Sucessfully With Name: "+cycle.getName());
		responce.setApiSucessStatus(true);
		responce.setDetails("Reference Brand Name : ");
		log.info("Cycle added Sucessfully with id :"+cycle.getId() );	
		
		return ResponseEntity.ok(responce);
	}
	
	public ResponseEntity<Object> addCassets(){
		
		return (ResponseEntity<Object>) ResponseEntity.ok().body("sdfkms").status(HttpStatus.ACCEPTED);
	}

}
