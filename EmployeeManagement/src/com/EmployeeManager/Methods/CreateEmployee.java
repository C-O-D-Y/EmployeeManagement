package com.EmployeeManager.Methods;

import java.util.ArrayList;
import java.util.Scanner;

import com.EmployeeManager.ShowOptions.EmployeeDetails;

public class CreateEmployee {
	static ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>();

	public void newEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Welcome \n");
		System.out.println("\n______ PERSONAL DETAILS______\n");
		System.out.println("Please enter your Name");
		String name = scanner.nextLine();
		System.out.println("Please enter your Age");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter Gender of the Employee");
		String gender=scanner.nextLine();
		System.out.println("Please enter Residence of the Employee");
		String address=scanner.nextLine();
		
		System.out.println("\n______ PROFESSIONAL DETAILS______\n");
		System.out.println("Please enter the id");
		int id = scanner.nextInt();
		System.out.println("Please enter the Salary");
		int salary = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter your Department");
		String department = scanner.nextLine();
		System.out.println("Please enter the Skills Employee have ");
		String skills=scanner.nextLine();
		al.add(new EmployeeDetails(name, id, salary, department, age, address, gender, skills));
		System.out.println("Employee Added");
	}
}
