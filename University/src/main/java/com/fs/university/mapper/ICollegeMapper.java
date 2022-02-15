package com.fs.university.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fs.university.dto.CollegeDto;
import com.fs.university.entities.College;

@Mapper
public interface ICollegeMapper 
{
	ICollegeMapper INSTANCE = Mappers.getMapper(ICollegeMapper.class);
	
	CollegeDto entityToDto(College college);
	College dtoToEntity(CollegeDto dto);
	College dtoToEntity(Integer collegeId);
	List<CollegeDto> entityToDto(List<College> col);
}
