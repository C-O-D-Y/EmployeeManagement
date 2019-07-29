package com.EmployeeManager.ShowOptions;

import java.util.Scanner;

import com.EmployeeManager.Choose.Controller;

public class User_Options {
	public User_Options() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n Please choose one of the below options" + "\n1: New Employee."
					+ "\n2: Fetch Employee." + "\n3: Delete current Employee." + "\n4: Exit ");
			int option = scanner.nextInt();
			new Controller(option);
		} while (1 > 0);
	}
}