package com.pack.setter.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSystemResource_Using_XMLBeanFactory_SetterMethodInjection {
	public static void main(String[] args) {
		Resource rs = new FileSystemResource("BeanConfigurationFileSystemResource.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		Student st = (Student) bf.getBean("stud");
		System.out.println("Student name : "+ st.getName());
		System.out.println("Student age : "+ st.getAge());
		System.out.println("Student id : "+ st.getId());
	}
}