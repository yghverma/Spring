package com.pack.contructor.injection;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private int age;
	
	public Employee(Integer id, String name, Double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}