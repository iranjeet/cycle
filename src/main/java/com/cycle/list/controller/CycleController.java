package com.cycle.list.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cycle.list.constants.*;
import com.cycle.list.dto.genericResponce.GenericResponce;
import com.cycle.list.dto.requestDto.AddBrands;
import com.cycle.list.dto.requestDto.RequestCycleDTO;
import com.cycle.list.services.CycleServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/v1/cycle")
@Api(value = "cycle_stores_updates", description = "operation to be performed by the SuperAdmin")
public class CycleController {

	private final Logger log = LoggerFactory.getLogger(CycleController.class);

	@Autowired
	CycleServices cycleServices;

	@PostMapping("/add_brands")
	@ApiOperation(value = "add new brands details along with brands Details ",response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,message = "added cycle deatils sucessfully"),
			@ApiResponse(code = 1, message = "don not know")
	})
	public GenericResponce addBrands(@RequestBody AddBrands add) {
		return cycleServices.addBrand(add);
	}
	
	@PostMapping("/add_cycle")
	@ApiOperation(value = "Add Cycle Details Along with the avaliable Stocks for the user", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code=999, message="Check")
	})
	public ResponseEntity<Object> addCycle(@RequestBody RequestCycleDTO add) {
		return cycleServices.addCycle(add);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-------------------------------------------------------------GetAllBasics--------------------------------------------------
	
	
	@GetMapping("/generic/getAllCategories")
	public List<Categories> getAllCategories(){
		log.info("All Categories Returned");
		return Arrays.asList(Categories.values());
	} 
	
	@GetMapping("/generic/getStatus")
	public List<Status> getAllStatus(){
		log.info("All the Status code name ");
		return Arrays.asList(Status.values());
	} 
	
	@GetMapping("/generic/getStatusCode")
	public Map<Object, Object> getStatusCode(){
		Map<Object , Object> status=new HashMap<Object, Object>();
		for(Status st:Status.values()) {
			status.put(st,st.getLabel());
		}
		log.info("all the status code name with value returned");
		return status;
	}
	
	@GetMapping("/generic/getAccessType")
	public List<AccessType> getAllAccessType(){
		log.info("all the Accesstype Returned");
		return Arrays.asList(AccessType.values());
	}
	
	@GetMapping("/generic/getGender")
	public List<Gender> getGender(){
		log.info("all the Gender Returned");
		return Arrays.asList(Gender.values());
	}


}
