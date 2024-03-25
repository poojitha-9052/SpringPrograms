package com.sathya.springex;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaCourseService implements CourseService
{

	@Override
	public void courseInfo() {
		System.out.println("welcome to Java Fullstack");
		System.out.println("There are corses like core java,adv java,spring");
		
	}

}
