package com.pack.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		 * ApplicationContext ac= new
		 * AnnotationConfigApplicationContext(ExampleConfiguration.class); Example1
		 * example1 = (Example1) ac.getBean(Example1.class);
		 * example1.setMessage1("hello"); System.out.println(example1.getMessage1());
		 * 
		 * Example2 example2 = (Example2) ac.getBean(Example2.class);
		 * example2.setMessage2("hello2"); System.out.println(example2.getMessage2());
		 * 
		 * 
		 * Example2 example3= (Example2) ac.getBean(Example2.class);
		 * System.out.println(example3);
		 * 
		 * Example2 example4 = (Example2) ac.getBean(Example2.class);
		 * System.out.println(example4);
		 */

		/*
		 * testing of Qualifier, autowire annotation 
		 * ApplicationContext ac= new
		 * ClassPathXmlApplicationContext("BeanConfiguration-annotation.xml"); Student
		 * exam3 = (Student) ac.getBean("stud"); System.out.println(exam3);
		 */

		/*
		 * Lazy loading of Bean Factory IOC container 
		 * Resource resource = new
		 * ClassPathResource("BeanConfiguration-annotation.xml"); BeanFactory bf = new
		 * XmlBeanFactory(resource); Sample2 sample2 = (Sample2) bf.getBean("sample2");
		 */

		// Eager loading of Context Factory IOC container 
		// To make context factory IOC container as Lazy loading then either use @lazy annotation or lazy-init=true
		 ApplicationContext ac= new	 ClassPathXmlApplicationContext("BeanConfiguration-annotation.xml"); 
		 Sample2 sample2 = (Sample2) ac.getBean("sample2");
		 

	}
}