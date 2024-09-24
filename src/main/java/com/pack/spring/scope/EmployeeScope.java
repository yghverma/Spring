package com.pack.spring.scope;

public class EmployeeScope {
	private Integer id;
	private String name;
	private Double salary;
	private int age;
	
	public EmployeeScope(Integer id, String name, Double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public EmployeeScope() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}