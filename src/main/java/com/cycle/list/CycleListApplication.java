package com.cycle.list;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration	
@EnableSwagger2
public class CycleListApplication {

	public static void main(String[] args) {
		SpringApplication.run(CycleListApplication.class, args);
		System.out.println("Swagger Url->    http://localhost:8888/swagger-ui.html#/  ");
	}
	
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build().apiInfo(apiInfo());                                           
    }
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Cycle Apis List 'Ranjeet' ", 
	      "To Be Acces By Ranjeet Only Personal Use Only 👍😁", 
	      "😡😡", 
	      "Terms of service ", 
	      new Contact("Ranjeet 👌  😎 🍗  ", "https://doqfy.in/", "ranjeet@anvayaanalytics.com"), 
	      "GitLab Status🌿🌿🌿 	", "https://gitlab.com/iranjit", Collections.emptyList());
	}
	

}
