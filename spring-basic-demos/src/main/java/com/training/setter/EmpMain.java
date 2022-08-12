package com.training.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
	/*Employee employee=new Employee();
	employee.setName("akash");
	employee.setEmployeeId(2);
	employee.setSalary(21344);
	System.out.println(employee);
	}*/
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp);
		Employee emp1=context.getBean(Employee.class,"employee");
		System.out.println(emp1);
		Employee emp2=context.getBean(Employee.class);
		System.out.println(emp2);
	}

}
