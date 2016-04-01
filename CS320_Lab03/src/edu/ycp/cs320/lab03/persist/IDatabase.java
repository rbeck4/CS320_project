package edu.ycp.cs320.lab03.persist;

import java.util.List;

import edu.ycp.cs320.lab03.model.Pair;
import edu.ycp.cs320.lab03.model.Reservation;

public interface IDatabase {
	public List<Pair<String, String>> findPasswordByUser(String username);
	public Integer insertUserIntoUsersTable(String usrname, String pass);
	public Integer insertReservationIntoReservationsTable(int usr, String site, String dateStart, String dateEnd, int cost);
	public List<Pair<String, Reservation>> findAllReservationsWithUser();
	public List<String> findAllUsers();
	}
