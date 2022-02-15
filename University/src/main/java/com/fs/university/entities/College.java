package com.fs.university.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class College 
{
	
	
	@Id
	private int collegeId;
	private String collegeName;
	private int noOfStudents;
	
	
	
	public College(int collegeId, String collegeName, int noOfStudents) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.noOfStudents = noOfStudents;
	}
	
	public College() 
	{
		
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", noOfStudents=" + noOfStudents
				+ "]";
		}


	 
	
	

}
