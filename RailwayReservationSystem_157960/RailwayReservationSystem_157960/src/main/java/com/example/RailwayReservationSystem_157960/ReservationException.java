package com.example.RailwayReservationSystem_157960;

//Exception class
public class ReservationException extends Exception
{
	String message;
	public ReservationException(String message) 
	{
		super(message);
	}
}
