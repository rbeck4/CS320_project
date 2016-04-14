package edu.ycp.cs320.lab03.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Reservation;

public class InitialData {

	// reads initial Author data from CSV file and returns a List of Authors
	public static List<Account> getAccount() throws IOException {
		List<Account> accountList = new ArrayList<Account>();
		ReadCSV readAccount = new ReadCSV("Account.csv");
		try {
			// auto-generated primary key for authors table
			Integer userId = 1;
			while (true) {
				List<String> tuple = readAccount.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Account acc = new Account();
//				acc.setUserId(Integer.parseInt(i.next()));
				acc.setUserId(userId++);				
				acc.setName(i.next());
				acc.setUsername(i.next());
				acc.setPassword(i.next());
				acc.setPayment(Integer.parseInt(i.next()));
				acc.setSecCode(Integer.parseInt(i.next()));
				acc.setEmail(i.next());
				acc.setAddress(i.next());
				accountList.add(acc);
			}
			return accountList;
		} finally {
			readAccount.close();
		}
	}
	
	// reads initial Book data from CSV file and returns a List of Books
	public static List<Reservation> getReservation() throws IOException {
		List<Reservation> reservList = new ArrayList<Reservation>();
		ReadCSV readReserv = new ReadCSV("reservations.csv");
		try {
			// auto-generated primary key for table books
			Integer reservId = 1;
			while (true) {
				List<String> tuple = readReserv.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Reservation reserv = new Reservation();
//				book.setBookId(Integer.parseInt(i.next()));
				reserv.setReservID(reservId++);				
				reserv.setUserID(Integer.parseInt(i.next()));
				reserv.setSite(i.next());
				reserv.setRoom(i.next());
				reserv.setCheckInDate(i.next());
				reserv.setCheckOutDate(i.next());
				reserv.setCost(Integer.parseInt(i.next()));
				reservList.add(reserv);
			}
			return reservList;
		} finally {
			readReserv.close();
		}
	}
}
