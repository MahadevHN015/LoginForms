package com.tap.servlets;

public class Employee {
	
	private String name;
	private int id;
	private String email;
	private int salary;
	private String dept;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, int id, String email, int salary, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	

}
