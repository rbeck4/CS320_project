package edu.ycp.cs320.lab03;


import java.util.Scanner;

import edu.ycp.cs320.lab03.persist.DatabaseProvider;
import edu.ycp.cs320.lab03.persist.IDatabase;

public class InsertNewUser {
	public static void main(String usrname, String pass) throws Exception {
		//Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		/*InitDatabase.init(keyboard);
		
		System.out.print("Enter the author's last name: ");
		String lastName = keyboard.nextLine();
		
		System.out.print("Enter the author's first name: ");
		String firstName = keyboard.nextLine();
		
		System.out.print("Enter the book's title: ");
		String title = keyboard.nextLine();
		
		System.out.print("Enter the book's ISBN: ");
		String isbn = keyboard.nextLine();
		*/
		// get the DB instance and execute the transaction
		IDatabase db = DatabaseProvider.getInstance();
		Integer usr_id = db.insertUserIntoUsersTable(usrname, pass);
		
		// check if the insertion succeeded
		if (usr_id > 0)
		{
			System.out.println("New user " + usrname + " account succesfully created.");
		}
		else
		{
			System.out.println("New user " + usrname + " account NOT created, please try again.");			
		}
	}
}
