package com.SpringBootTraining.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootTraining.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
