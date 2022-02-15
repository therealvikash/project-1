package com.fs.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fs.university.entities.College;

public interface ICollegeRepository extends JpaRepository<College, Integer>
{

}
