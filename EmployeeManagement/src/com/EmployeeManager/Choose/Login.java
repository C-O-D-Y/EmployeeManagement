package com.EmployeeManager.Choose;

import java.util.Scanner;

import com.EmployeeManager.ShowOptions.User_Options;

public class Login {
	private static String Username = "cody";
	private static String Password = "saurabh";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username[Case Sensitive]");
		String user = scanner.nextLine();
		System.out.println("Enter the Password[Case Sensitive]");
		String pass = scanner.nextLine();
		if (Username.equals(user) && Password.equals(pass)) {
		System.out.println("\n Welcome to Employer Management services");
			new User_Options();
		}
		else
		{
			System.out.println("Wrong credentials");
		}
	}

}
