package com.fs.university.services;

import java.util.List;

import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;

public interface ICollegeService 
{
	public College addCollegeInfo(CollegeDto dto);
	public List<CollegeDto> viewAllCollege();
	public List<CollegeDto> healthCheck();
}
