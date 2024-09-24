package com.pack.setter.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClassPathResource_Using_XMLBeanFactory_SetterMethodInjection {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("BeanConfiguration.xml");// locate XML file
		BeanFactory bf = new XmlBeanFactory(res); //Load beans from XML files
		Student st= (Student) bf.getBean("stud");// Initialize the bean with stud from BeanConfigurtaion.xml via setter method
		
		System.out.println("Student name : "+ st.getName());
		System.out.println("Student age : "+ st.getAge());
		System.out.println("Student id : "+ st.getId());
	}
}
