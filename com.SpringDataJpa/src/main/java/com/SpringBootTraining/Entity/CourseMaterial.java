package com.SpringBootTraining.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course_material",
       uniqueConstraints = @UniqueConstraint(
    		   name = "url_unique",
               columnNames = "course_url"))
@ToString(exclude = "course")
public class CourseMaterial {

	@Id
	@SequenceGenerator(
			name="course_material_sequence",
			sequenceName="course_material_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_material_sequence"
	)
	private Long courseMaterialId;
	
	@Column(name = "course_url", nullable = false)
	private String url;
	
	@OneToOne(cascade = CascadeType.ALL,
			  fetch = FetchType.LAZY,
			  optional = false
			)
	/*
	 * */
	
	@JoinColumn(
			name = "course_id",
			referencedColumnName = "courseId"
			)
	private Course course;
}
