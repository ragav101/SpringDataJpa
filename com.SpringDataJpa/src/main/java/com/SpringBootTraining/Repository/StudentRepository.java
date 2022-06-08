package com.SpringBootTraining.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootTraining.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
}
