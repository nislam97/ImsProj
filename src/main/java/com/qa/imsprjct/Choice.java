package com.qa.imsprjct;
import java.util.Scanner;

public class Choice {


	private static Scanner c = new Scanner(System.in);
	

	public String getInput() {
		System.out.println("Enter CRUD choice: ");
		return c.nextLine();
	}

	public void options() {
		
		CRUD cd = new CRUD();

		String crud = getInput();

		
		try {
			
			do {
				
				switch (crud.toLowerCase()) {
				case "create":
					System.out.println("Enter first name");
					String f = c.nextLine();
					System.out.println("Enter surname");
					String s = c.nextLine();
					cd.create(f, s);
					break;
				case "read":
					
					break;
				case "update":
								
					break;
				case "delete":
			
					break;
				default:
					System.out.println("Invalid CRUD choice");
				}
				
				System.out.println("Would you like to continue? (yes/no)");
				String quit = c.nextLine();
				if (quit.toLowerCase().equals("yes")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("no")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'yes' or 'no'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Bye! See you later!");
		} finally {
			cd.closeCon();
		}
	}

}

