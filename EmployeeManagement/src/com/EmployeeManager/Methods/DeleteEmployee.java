package com.EmployeeManager.Methods;

import java.util.Scanner;

public class DeleteEmployee extends FetchEmployeeOption {
	Scanner scanner = new Scanner(System.in);
	DeleteEmployeeMethods dem = new DeleteEmployeeMethods();

	public DeleteEmployee() {
		super();
		deleteOptions();
	}

	public void deleteOptions() {
		switch (scanner.nextInt()) {
		case 1:
			dem.delete();
			break;
		case 2:
			System.out.println("Please enter the id of the Employee");
			int id = scanner.nextInt();
			dem.delete(id);
			break;

		case 3:
			System.out.println("Please enter the Name of the Employee");
			scanner.nextLine();
			String name = scanner.nextLine();
			dem.delete(name);
			break;

		case 4:

			System.out.println("Please enter the Department of the Employee");
			scanner.nextLine();
			String department = scanner.nextLine();
			dem.delete(department);
			break;

		default:
			System.out.println("Sorry! Wrong Input");
		}
	}
}
