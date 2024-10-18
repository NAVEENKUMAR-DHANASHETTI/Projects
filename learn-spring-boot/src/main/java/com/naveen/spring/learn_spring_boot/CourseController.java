package com.naveen.spring.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourse() {
		return Arrays.asList(new Course(1, "Learn AWS", "Naveen"), new Course(2, "Learn JAVA", "Naveen"), new Course(2, "Learn C",	 "Kiran"));
	}

}
