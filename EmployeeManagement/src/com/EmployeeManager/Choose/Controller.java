package com.EmployeeManager.Choose;

import com.EmployeeManager.Methods.CreateEmployee;
import com.EmployeeManager.Methods.DeleteEmployee;
import com.EmployeeManager.Methods.FetchEmployeeOption;

public class Controller {
	public Controller(int choose) {
		switch (choose) {
		case 1:
			CreateEmployee ce = new CreateEmployee();
			ce.newEmployee();
			break;
		case 2:
			new FetchEmployeeOption().options();
			break;
		case 3:
			new DeleteEmployee();
			break;
		case 4:
			System.out.println("Adios Amigo");
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Option, Please select Correct Option");
		}
	}
}
