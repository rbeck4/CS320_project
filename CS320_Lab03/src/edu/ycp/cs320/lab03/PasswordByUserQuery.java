package edu.ycp.cs320.lab03;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Reservation;
import edu.ycp.cs320.lab03.model.Pair;
import edu.ycp.cs320.lab03.persist.DatabaseProvider;
import edu.ycp.cs320.lab03.persist.IDatabase;

public class PasswordByUserQuery {
	static String passDB = new String();
	public static boolean main(String usrName, String pass) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		//InitDatabase.init(keyboard);
		
		//System.out.print("Enter an author's last name: ");
		//String usrName = keyboard.nextLine();
		
		IDatabase db = DatabaseProvider.getInstance();
		List<Pair<String, String>> userPassList = db.findPasswordByUser(usrName);
		if (userPassList.isEmpty()) {
			//User is not in the system
			//System.out.println("User name <" + usrName + "> is invalid, please enter username or create an account");
			return false;
		}
		else {
			for (Pair<String, String> userPass : userPassList) {
				//String user = userPass.getLeft();
				passDB = userPass.getRight();
				//System.out.println(author.getLastname() + "," + author.getFirstname() + "," + book.getTitle() + "," + book.getIsbn());
			}
			if(pass.equals(passDB)){
				return true;
			}
			else{
				return false;
			}
			
		}

	}
}