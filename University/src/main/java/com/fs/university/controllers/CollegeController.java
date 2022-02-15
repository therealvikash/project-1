package com.fs.university.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;
import com.fs.university.services.ICollegeService;

@Service
@RestController
@RequestMapping("/college")
public class CollegeController 
{
	@Autowired
	private ICollegeService iCollegeService;
	
	Logger logger = LoggerFactory.getLogger(CollegeController.class);
	
	@PostMapping(value = "/addcollege")
	public ResponseEntity<College> addCollegeInfo(@RequestBody CollegeDto dto)
	{
		College addCollegeInfo = iCollegeService.addCollegeInfo(dto);
		logger.info("College Added");
		return new ResponseEntity<College>(addCollegeInfo, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "viewallcollege")
	public ResponseEntity<List<CollegeDto>> viewAllCollege()
	{
		List<CollegeDto> viewAllCollege = iCollegeService.viewAllCollege();
		logger.info("List of all college viewed");
		return new ResponseEntity<List<CollegeDto>>(viewAllCollege, HttpStatus.OK);
	}
	
}
