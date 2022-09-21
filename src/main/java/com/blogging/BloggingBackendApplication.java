package com.blogging;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc //To  Enable Swagger
public class BloggingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggingBackendApplication.class, args);
		
	}
	
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
		
	}

	
}
