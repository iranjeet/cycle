package com.cycle.list;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages="com.cycle")
public class CycleListApplication {

	public static void main(String[] args) {
		SpringApplication.run(CycleListApplication.class, args);
		System.out.println("Swagger Url-> \n 😎\n😎 \n   http://localhost:8888/swagger-ui.html#/  ");
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
