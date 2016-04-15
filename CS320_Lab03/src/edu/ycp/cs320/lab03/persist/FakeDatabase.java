package edu.ycp.cs320.lab03.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Pair;
import edu.ycp.cs320.lab03.model.Reservation;

public class FakeDatabase implements IDatabase {
	
	private List<Account> accountList;
	private List<Reservation> reservList;
	
	// Fake database constructor - initializes the DB
	// the DB only consists for a List of Authors and a List of Books
	public FakeDatabase() {
		accountList = new ArrayList<Account>();
		reservList = new ArrayList<Reservation>();
		
		// Add initial data
		readInitialData();
		
//		System.out.println(authorList.size() + " authors");
//		System.out.println(bookList.size() + " books");
	}

	// loads the initial data retrieved from the CSV files into the DB
	public void readInitialData() {
		try {
			accountList.addAll(InitialData.getAccount());
			reservList.addAll(InitialData.getReservation());
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}
	
	// query that retrieves all reservations belonging to a user from DB
	@Override
	public List<Reservation> findAllReservationsWithUser(String userName) {
		return findAllReservationsWithUser(userName);
	}
	
	
	// query that inserts a new Book, and possibly new Author, into Books and Authors lists
	// insertion requires that we maintain Book and Author id's
	// this can be a real PITA, if we intend to use the IDs to directly access the ArrayLists, since
	// deleting a Book/Author in the list would mean updating the ID's, since other list entries are likely to move to fill the space.
	// or we could mark Book/Author entries as deleted, and leave them open for reuse, but we could not delete an Author
	//    unless they have no Books in the Books table
	@Override
	public Integer insertReservationIntoReservationsTable(String usr, String site, String dateStart, String dateEnd, int cost)
	{
		int authorId = -1;
		int bookId   = -1;
		
		// search Authors list for the Author, by first and last name, get author_id
		for (Author author : authorList) {
			if (author.getLastname().equals(lastName) && author.getFirstname().equals(firstName)) {
				authorId = author.getAuthorId();
			}
		}
		
		// if the Author wasn't found in Authors list, we have to add new Author to Authors list
		if (authorId < 0) {
			// set author_id to size of Authors list + 1 (before adding Author)
			authorId = authorList.size() + 1;
			
			// add new Author to Authors list
			Author newAuthor = new Author();			
			newAuthor.setAuthorId(authorId);
			newAuthor.setLastname(lastName);
			newAuthor.setFirstname(firstName);
			authorList.add(newAuthor);
			
			System.out.println("New author (ID: " + authorId + ") " + "added to Authors table: <" + lastName + ", " + firstName + ">");
		}

		// set book_id to size of Books list + 1 (before adding Book)
		bookId = bookList.size() + 1;

		// add new Book to Books list
		Book newBook = new Book();
		newBook.setBookId(bookId);
		newBook.setAuthorId(authorId);
		newBook.setTitle(title);
		newBook.setIsbn(isbn);
		bookList.add(newBook);
		
		// return new Book Id
		return bookId;
	}
	
	// query that retrieves an Account based on userID
	@Override
	public Account findUsersWithUsername(String userName) {
		for (Account acc : accountList) {
			String temp = acc.getUsername();
			if (temp.equals(userName)) {
				return acc;
			}
		}
		return null;
	}
}
