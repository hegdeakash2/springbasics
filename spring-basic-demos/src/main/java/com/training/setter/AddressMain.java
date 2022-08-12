package com.training.setter;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AddressMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		
		Employee employee=context.getBean(Employee.class, "employee");
		Address adress=context.getBean(Address.class, "adress");
		
		
		System.out.println(employee);
		
		

	}

}
