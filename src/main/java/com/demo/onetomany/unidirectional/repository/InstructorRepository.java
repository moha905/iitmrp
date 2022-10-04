package com.demo.onetomany.unidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.onetomany.unidirectional.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer>{

}
