package edu.ycp.cs320.lab03;


import java.util.Scanner;

import edu.ycp.cs320.lab03.persist.DatabaseProvider;
import edu.ycp.cs320.lab03.persist.IDatabase;

public class InsertReservation {
	public static void main(int usr, String site, String dateStart, String dateEnd, int cost) throws Exception {
		/*Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		InitDatabase.init(keyboard);
		
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
		Integer reserv_id = db.insertReservationIntoReservationsTable(usr, site, dateStart, dateEnd, cost);
		
		// check if the insertion succeeded
		if (reserv_id > 0)
		{
			System.out.println("New reservation (ID: " + reserv_id + ") successfully reserved.");
		}
		else
		{
			System.out.println("Reservation (ID: " + reserv_id + "failed, please try again.");			
		}
	}
}
