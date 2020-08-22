package model;

import java.util.ArrayList;

import model.Client.IdType;

public class Minimarket 
{
	
	private ArrayList<Client> people;
	private int entranceAttemps;
	
	public Minimarket()
	{
		people = new ArrayList<Client>();

		entranceAttemps = 0;
	}
	
	public ArrayList<Client> getPeople()
	{
		return people;
	}
	
	public boolean Entrance(IdType id, String idNumder)
	{
		return false;
	}
	
	public int getEntranceAttemps()
	{
		return entranceAttemps;
	}
	
	

}
