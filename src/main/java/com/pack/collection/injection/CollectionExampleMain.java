package com.pack.collection.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionExampleMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("BeanConfiguration-collection.value.setter.injection.xml");
		CollectionExample ce = (CollectionExample)ac.getBean("collectionId");
		System.out.println(ce.getNameList());
		System.out.println(ce.getNameSet());
		System.out.println(ce.getNameMap());
		System.out.println(ce.getNameProperty());
	}
}