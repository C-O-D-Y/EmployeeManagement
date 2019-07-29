package com.EmployeeManager.ShowOptions;

import java.util.Iterator;

public class EmployeeDetails {
	public static Iterator<EmployeeDetails> iterator;
	public String name;
	public int id;
	public double salary;
	public String department;
	public int age;
	public String address;
	public String gender;
	public String skills;

	public EmployeeDetails(String name, int id, double salary, String department, int age, String address,
			String gender, String skills) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.department = department;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.skills = skills;
	}
}