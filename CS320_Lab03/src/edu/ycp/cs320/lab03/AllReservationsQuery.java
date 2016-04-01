package edu.ycp.cs320.lab03;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.lab03.model.Reservation;
import edu.ycp.cs320.lab03.model.Pair;
import edu.ycp.cs320.lab03.persist.DatabaseProvider;
import edu.ycp.cs320.lab03.persist.IDatabase;

public class AllReservationsQuery {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		InitDatabase.init(keyboard);
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		List<Pair<String, Reservation>> reservList = db.findAllReservationsWithUser();
		
		// check if anything was returned and output the list
		if (reservList.isEmpty()) {
			System.out.println("There are no valid reservations.");
		}
		else {
			for (Pair<String, Reservation> userReserv : reservList) {
				//String usr = userReserv.getLeft();
				Reservation reserv = userReserv.getRight();
				System.out.println(reserv.getSite() + ", " + reserv.getCheckInDate() + ", " + reserv.getCheckOutDate() + ", " + reserv.getCost());
			}
		}
	}
}
