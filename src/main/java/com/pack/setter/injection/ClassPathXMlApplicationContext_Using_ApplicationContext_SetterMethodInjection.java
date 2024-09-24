package com.pack.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXMlApplicationContext_Using_ApplicationContext_SetterMethodInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfiguration.xml");
		Student st = (Student) applicationContext.getBean("stud");
		System.out.println("Student name : "+ st.getName());
		System.out.println("Student age : "+ st.getAge());
		System.out.println("Student id : "+ st.getId());
	}
}