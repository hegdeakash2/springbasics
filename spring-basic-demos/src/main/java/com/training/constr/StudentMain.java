package com.training.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.training");

		Student student = context.getBean(Student.class, "student");
		Course course = context.getBean(Course.class, "course");
		System.out.println(student);
		
	}

}
