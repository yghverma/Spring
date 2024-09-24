package com.pack.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfiguration-reference.xml");
		Student st= (Student)applicationContext.getBean("stud");
		System.out.println("Stud" + st);
	}
}