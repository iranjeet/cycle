package com.cycle.list.configuration;

import static com.google.common.collect.Lists.*;



import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;


import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.GrantType;
import springfox.documentation.service.OAuth;
import springfox.documentation.service.ResourceOwnerPasswordCredentialsGrant;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@Configuration	
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket api() { 
		return new Docket(DocumentationType.SWAGGER_2)  
				.select()                                  
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))             
				.paths(PathSelectors.any())                          
				.build().apiInfo(apiInfo());                                           
	}



	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Cycle-Api's List RANJEET 😎😎")
				.description(" To be Accessed By Ranjeet😀😁😎 ")
				.termsOfServiceUrl("https://www.example.com/")
				.contact(new Contact("Ranjeet 👌  😎 🍗  ", "https://www.linkedin.com/in/iranjeet/", "ranjeet@anvayaanalytics.com"))
				.license("GitLab Status	\"")
				.licenseUrl("https://github.com/iranjeet")
				.version("2020.v1")
				.build();
	}

	
    private OAuth securitySchema() {

        List<AuthorizationScope> authorizationScopeList = newArrayList();
        authorizationScopeList.add(new AuthorizationScope("read", "read all"));
        authorizationScopeList.add(new AuthorizationScope("trust", "trust all"));
        authorizationScopeList.add(new AuthorizationScope("write", "access all"));
        authorizationScopeList.add(new AuthorizationScope("role_admin", "access all"));
        authorizationScopeList.add(new AuthorizationScope("role_user", "access all"));

        List<GrantType> grantTypes = newArrayList();
        GrantType creGrant = new ResourceOwnerPasswordCredentialsGrant("http://3.1.104.251:9001/oauth/token");

        grantTypes.add(creGrant);

        return new OAuth("oauth2schema", authorizationScopeList, grantTypes);

    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.ant("/private/**"))
                .build();
    }

    private List<SecurityReference> defaultAuth() {

        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[5];
        authorizationScopes[0] = new AuthorizationScope("read", "read all");
        authorizationScopes[1] = new AuthorizationScope("trust", "trust all");
        authorizationScopes[2] = new AuthorizationScope("write", "write all");
        authorizationScopes[3] = new AuthorizationScope("role_admin", "write all");
        authorizationScopes[4] = new AuthorizationScope("role_user", "write all");

        return Collections.singletonList(new SecurityReference("oauth2schema", authorizationScopes));
    }

	
	
	
	
	
	
	 @Bean
	    public SecurityConfiguration securityInfo() {
	        return new SecurityConfiguration("CYCLE", "password", "", "", "", ApiKeyVehicle.HEADER, "", " ");
	    }
	 





}
