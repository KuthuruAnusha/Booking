package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Airport;
import com.cg.fms.entity.Booking;
import com.cg.fms.entity.BookingInfo;
import com.cg.fms.entity.Login;
import com.cg.fms.exception.AirportException;
import com.cg.fms.exception.BookingException;


public interface BookingService {

	public Booking addBooking(BookingInfo info) throws BookingException;
	public List <Airport> findAllAP() throws AirportException;
	
	

	

   public Booking findAllBookingId(int bookingId) throws BookingException;
	
	
	public List<Booking> findAllBookings() throws BookingException;
	
	
	public Booking deleteBookingById(int bookingId) throws BookingException;
	public Login findUser(String username , String password) throws BookingException;
	
	

}
