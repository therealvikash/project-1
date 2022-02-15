package com.fs.university.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.university.bo.ICollegeBO;
import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;

@Service
public class ICollegeServiceImpl implements ICollegeService
{

	@Autowired
	private ICollegeBO iCollegeBO;
	
	Logger logger = LoggerFactory.getLogger(ICollegeServiceImpl.class);
	
	@Override
	public College addCollegeInfo(CollegeDto dto)
	{
		logger.info("College Added!!!");
		return iCollegeBO.addCollegeInfo(dto);
	}

	@Override
	public List<CollegeDto> viewAllCollege()
	{
		logger.info("College Viewed!!!");
		return iCollegeBO.viewAllCollege();
	}

	@Override
	public List<CollegeDto> healthCheck() {
		// TODO Auto-generated method stub
		return null;
	}

}
