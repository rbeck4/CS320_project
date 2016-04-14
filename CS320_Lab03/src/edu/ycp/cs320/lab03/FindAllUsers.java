package edu.ycp.cs320.lab03;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.persist.DatabaseProvider;
import edu.ycp.cs320.lab03.persist.IDatabase;

public class FindAllUsers {
	public static void main() throws Exception {
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		InitDatabase.init(keyboard);
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		List<Account> userList = db.findAllUsers();
		
		// check if anything was returned and output the list
		if (userList.isEmpty()) {
			System.out.println("There are no users in the database");
		}
		else {
			for (Account usr : userList) {
				System.out.println(usr.getName());
			}
		}
	}
}
