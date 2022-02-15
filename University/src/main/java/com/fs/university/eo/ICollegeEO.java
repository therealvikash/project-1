package com.fs.university.eo;

import java.util.List;

import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;

public interface ICollegeEO 
{
	public College addCollegeInfo(CollegeDto dto);
	public List<CollegeDto> viewAllCollege();
	public List<CollegeDto> healthCheck();
	//public College viewCollege(int collegeId);
	
}
