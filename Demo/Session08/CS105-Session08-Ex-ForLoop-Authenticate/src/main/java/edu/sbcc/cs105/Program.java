package edu.sbcc.cs105;

import java.util.Scanner;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) throws Exception {

		if (attemptLogin()) {
			System.out.println("You are allowed in");
		} else {
			System.out.println("Access denied!");
		}

	}

	private static boolean attemptLogin() throws Exception {

		boolean authenticated = false;
		String userName;
		String password;
		Scanner s = null;
		for (int i = 0; i < 3; i++) {

			userName = "";
			password = "";
			s = new Scanner(System.in);

			System.out.print("Enter your username: ");
			userName = s.nextLine();
			System.out.print("Enter your password: ");
			password = s.nextLine();

			authenticated = Security.authenticateUser(userName, password);
			if (authenticated) {
				break;
			}
			

		}
		s.close();
		
		return authenticated;
	}

}