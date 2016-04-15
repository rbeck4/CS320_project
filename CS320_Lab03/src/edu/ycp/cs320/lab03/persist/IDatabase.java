package edu.ycp.cs320.lab03.persist;

import java.util.List;

import edu.ycp.cs320.lab03.model.Account;
import edu.ycp.cs320.lab03.model.Pair;
import edu.ycp.cs320.lab03.model.Reservation;

public interface IDatabase {
	public Integer insertUserIntoAccountTable(String name, String username, String pass, String payment, String secCode, String email, String address);
	public Integer insertReservationIntoReservationsTable(String usr, String site, String dateStart, String dateEnd, int cost);
	public List<Reservation> findAllReservationsWithUser(String userName);
	public Account findUsersWithUsername(String userName);
	//public List<Reservation> removeReservationBySiteandUsername(String site, String userName);
	}
