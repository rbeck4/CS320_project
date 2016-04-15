package edu.ycp.cs320.lab03.persist.DerbyDataBaseTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Reservation;
import edu.ycp.cs320.lab03.persist.DatabaseProvider;
import edu.ycp.cs320.lab03.persist.DerbyDatabase;
//import edu.ycp.cs320.lab03.model.Pair;
import edu.ycp.cs320.lab03.persist.IDatabase;

public class DerbyDatabaseTests {

	private IDatabase db = null;
	
	List<Account> Account = null;
	List<Reservation>   reservations  = null;
	Account accountList = null;
	List<Reservation> reservationList = null;
	String userName = "Ryan";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// creating DB instance here
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindAllReservationsWithAccount() {
		System.out.println("\n*** Testing finding of reservations with users ***");

		// get the list of Reservations from DB
		String userName = "ryan";
		reservationList = db.findAllReservationsWithUser(userName);
		
		// NOTE: this is a simple test to check if no results were found in the DB
		if (reservationList.isEmpty()) {
			System.out.println("No books in database");
			fail("No books returned from Library DB");
		}
		// NOTE: assembling the results into Author and Book lists so that they could be
		//       inspected for correct content - well-formed objects with correct content
		else {
			reservations = new ArrayList<Reservation>();
			for (int i = 0; i < reservations.size(); i++) {
				Reservation reserv = reservations.get(i);
				reservations.add(reserv);
				System.out.println(reserv.getUserID() + ", " + reserv.getSite() + ", " + reserv.getRoom() + ", " + reserv.getCheckInDate() + 
						", " + reserv.getCheckOutDate() + ", " + reserv.getCost());
			}			
		}
	}

	@Test
	public void testFindUsersWithUsername() {

		System.out.println("\n*** Testing findAllAccounts ***");

		// get the list of (Accounts) pairs from DB
		Account acc = db.findUsersWithUsername(userName);

		// NOTE: this is a simple test to check if no results were found in the DB
		if (acc == null) {
			System.out.println("No accounts found for user" + userName);
			fail("No accounts returned from DB");
		}
		// NOTE: assembling the results into Author and Book lists so that they could be
		//       inspected for correct content - well-formed objects with correct content
		else {
				System.out.println(acc.getUserId() + ", " + acc.getName() + ", " + acc.getUsername() + acc.getPassword() + ", "
						+ acc.getPayment() + ", " + acc.getSecCode() + ", " + acc.getEmail() + ", " + acc.getAddress());
			}			
	}
	

	@Test
	public void testInsertReservationIntoReservationsTable() {
		System.out.println("\n*** Testing insertReservationIntoReservationsTable ***");

		String usrID = Integer.toString(2);
		String site = "Home";
		String room = "420";
		String dateStart = Integer.toString(10-14-16);
		String dateEnd = Integer.toString(10-16-16);
		int cost = 15;
				
		// insert new book (and possibly new author) into DB
		Integer reservID = db.insertReservationIntoReservationsTable(usrID, site, room, dateStart, dateEnd, cost);;

		// check the return value - should be a reservationID > 0
		if (reservID > 0)
		{
			// try to retrieve the reservation from the DB
			// get the list of (Author, Book) pairs from DB
			reservationList = db.findAllReservationsWithUser(userName);
			
			if (reservationList.isEmpty()) {
				System.out.println("No reservations found for user <" + userName + ">");
				fail("Failed to insert new reservation <" + site + "> into DB");
			}
			// otherwise, the test was successful.  Now remove the reservation just inserted to return the DB
			// to it's original state, except for using a reservationID
			else {
				System.out.println("New reservation (ID: " + reservID + ") successfully added to reservations table: <" + site + ">");
				
				// now delete reservation from DB
				// leaving the DB in its previous state - except that an reservationID has been used
//				List<Reservation> reservation = db.removeReservationBySiteandUser(site, userName);				
			}
		}
		else
		{
			System.out.println("Failed to insert new reservation (ID: " + reservID + ") into reservations table: <" + site + ">");
			fail("Failed to insert new resrvation <" + site + "> into DB");
		}
	}
	
	@Test
	public void testInsertAccountIntoAccountTable() {
		System.out.println("\n*** Testing insertAccountintoAccountTable ***");

		String name = "Jim Kurk";
		String username = "Enterprise";
		String pass = "NCC1701";
		String payment = "7890789078907890";
		String secCode = "951";
		String email = "captkurk@USSEnterprise.ufp";
		String address = "FollowThePrimeDirective101";
				
		// insert new book (and possibly new author) into DB
		Integer userID = db.insertUserIntoAccountTable(name, username, pass, payment, secCode, email, address);

		// check the return value - should be a reservationID > 0
		if (userID > 0)
		{
			// try to retrieve the reservation from the DB
			// get the list of (Author, Book) pairs from DB
			accountList = db.findUsersWithUsername(username);
			
			if (reservationList.isEmpty()) {
				System.out.println("No reservations found for user <" + username + ">");
				fail("Failed to insert new account <" + name + "> into DB");
			}
			// otherwise, the test was successful.  Now remove the account just inserted to return the DB
			// to it's original state, except for using a userID
			else {
				System.out.println("New account (ID: " + userID + ") successfully added to reservations table: <" + username + ">");
			}
		}
		else
		{
			System.out.println("Failed to insert new account (ID: " + userID + ") into Account table: <" + username + ">");
			fail("Failed to insert new account <" + username + "> into DB");
		}
	}
/*
	@Test
	public void testRemoveReservationBySiteandUsername() {
		System.out.println("\n*** Testing removeBookByTitle ***");
		
		String title     = "Outliers";
		String isbn      = "4-10-2016-02";
		String lastName  = "Malcolm";
		String firstName = "Gladwell";
				
		// insert new book (and new author) into DB
		Integer book_id = db.insertBookIntoBooksTable(title, isbn, lastName, firstName);
		
		// check to see that insertion was successful before proceeding
		if (book_id > 0) {
			// now delete Book (and its Author) from DB
			List<Author> authors = db.removeBookByTitle(title);
			
			if (authors.isEmpty()) {
				System.out.println("Failed to remove Author(s) for book with title <" + title + ">");
				fail("No Author(s) removed from DB for Book with title <" + title + ">");
			}
			else {
				System.out.println("Author <" + authors.get(0).getLastname() + ", " + authors.get(0).getFirstname() + "> removed from Library DB");
			}					
			
			// get the list of (Author, Book) pairs from DB
			authorBookList = db.findAuthorAndBookByTitle(title);
			
			if (authorBookList.isEmpty()) {
				System.out.println("All Books with title <" + title + "> were removed from the Library DB");
			}
			else {
				fail("Book with title <" + title + "> remains in Library DB after delete");			
			}
		}
		else {
			System.out.println("Failed to insert new book (ID: " + book_id + ") into Books table: <" + title + ">");
			fail("Failed to insert new book <" + title + "> into Library DB");			
		}
	}
	*/
}
