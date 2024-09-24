package com.pack.contructor.injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfiguration.xml");
		Employee emp = (Employee)context.getBean("emp");
		System.out.println(emp);
	}
}