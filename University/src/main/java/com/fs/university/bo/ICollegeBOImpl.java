package com.fs.university.bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;
import com.fs.university.eo.ICollegeEO;
import com.fs.university.mapper.ICollegeMapper;
import com.fs.university.mapper.ICollegeMapperImpl;

@Component
public class ICollegeBOImpl implements ICollegeBO
{
	@Autowired
	private ICollegeEO iCollegeEO;
	
	private ICollegeMapper iCollegeMapper = new ICollegeMapperImpl();
	
	Logger logger = LoggerFactory.getLogger(ICollegeBOImpl.class);

	@Override
	public College addCollegeInfo(CollegeDto dto) 
	{
		logger.info("College Added From BO!!!");
		return iCollegeEO.addCollegeInfo(dto);
	}

	@Override
	public List<CollegeDto> viewAllCollege() 
	{
		logger.info("College Viewed From BO!!!");
		return iCollegeEO.viewAllCollege();
	}

	@Override
	public List<CollegeDto> healthCheck() {
		try 
		{
			return iCollegeEO.viewAllCollege();
		} 
		catch(Exception e) 
		{
			return null;
		}
	}
	
}
