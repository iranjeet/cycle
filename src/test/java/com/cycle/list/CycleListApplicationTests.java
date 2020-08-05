package com.cycle.list;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cycle.list.constants.EndUser;
import com.cycle.list.domain.Cycle;

@SpringBootTest
class CycleListApplicationTests {
	
	EntityManager em;
	private final Logger log = LoggerFactory.getLogger(CycleListApplication.class);

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void  Check(Cycle k) {
		EndUser[] user=new EndUser[]{EndUser.Men,EndUser.KidsBoys};//{EndUser.Men,EndUser.KidsBoys};
		log.info(user.toString());
		
	}

}
