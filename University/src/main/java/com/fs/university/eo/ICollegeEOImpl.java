package com.fs.university.eo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fs.university.bo.ICollegeBOImpl;
import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;
import com.fs.university.exception.CollegeAlreadyExist;
import com.fs.university.exception.CollegesNotFound;
import com.fs.university.mapper.ICollegeMapper;
import com.fs.university.mapper.ICollegeMapperImpl;
import com.fs.university.repositories.ICollegeRepository;

@Component
public class ICollegeEOImpl implements ICollegeEO
{

	@Autowired
	private ICollegeRepository iCollegeRepository;
	
	private ICollegeMapper iCollegeMapper = new ICollegeMapperImpl();
	
	Logger logger = LoggerFactory.getLogger(ICollegeEOImpl.class);
	
	@Override
	public College addCollegeInfo(CollegeDto dto)
	{
		logger.info("College Added From EO!!!");
		return iCollegeRepository.save(iCollegeMapper.dtoToEntity(dto));
	}

	@Override
	public List<CollegeDto> viewAllCollege() throws CollegesNotFound
	{
		List<CollegeDto> allCollege = iCollegeMapper.entityToDto(iCollegeRepository.findAll());
		if (allCollege.isEmpty()) 
		{
			logger.info("College can not be viewed!!!");
			throw new CollegesNotFound("College List is Empty!!!");	
		} 
		else 
		{
			logger.info("College Viewed From EO!!!");
			return allCollege;
		}
		
	}

	@Override
	public List<CollegeDto> healthCheck() 
	{
		try 
		{
			return iCollegeMapper.entityToDto(iCollegeRepository.findAll());
		} 
		catch(Exception e) 
		{
			return null;
		}
	}

}
