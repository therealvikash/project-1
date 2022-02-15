package com.fs.university.bo;

import java.util.List;

import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;

public interface ICollegeBO 
{
	public College addCollegeInfo(CollegeDto dto);
	public List<CollegeDto> viewAllCollege();
	public List<CollegeDto> healthCheck();
	//public CollegeDto viewCollege(int collegeId);
	
}
