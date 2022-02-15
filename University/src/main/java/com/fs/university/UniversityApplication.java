package com.fs.university;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UniversityApplication 
{
	static Logger logger = LoggerFactory.getLogger(UniversityApplication.class);
	
	public static void main(String[] args) 
	{
		
		SpringApplication.run(UniversityApplication.class, args);
		logger.info("University Application Started!!!");
	}

}
