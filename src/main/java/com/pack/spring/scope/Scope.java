package com.pack.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scope {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("BeanConfiguration-Scope.xml");
		//For Singleton only one Object will be created - by default Singleton
		EmployeeScope empS = (EmployeeScope) ac.getBean("empScope");
		EmployeeScope empS1 = (EmployeeScope) ac.getBean("empScope");
		System.out.println(empS.hashCode());
		System.out.println(empS1.hashCode());
	}
}