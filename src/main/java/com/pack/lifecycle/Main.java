package com.pack.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		/*
		 * // Test Lifecycle of Spring
		 * AbstractApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("BeanConfiguration-lifecycle.xml"); Person p =
		 * (Person) applicationContext.getBean("person1"); System.out.println(p);
		 * 
		 * applicationContext.registerShutdownHook(); //applicationContext.close();
		 */	
	
	ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfiguration-lifecycle.xml");
	Person p = (Person) applicationContext.getBean("person1");
	System.out.println(p);
	
	applicationContext.registerShutdownHook();
	//applicationContext.close();
}
}