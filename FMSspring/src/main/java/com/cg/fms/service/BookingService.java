package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Booking;
import com.cg.fms.entity.BookingInfo;
import com.cg.fms.exception.BookingException;


public interface BookingService {
	//public Booking addBooking(Booking booking) throws BookingException;
	public Booking addBooking(BookingInfo info) throws BookingException;
	//public Booking modifyBooking(Booking booking) ;
	
	//public Booking modifyBooking(Booking booking,int noofpassengers) throws BookingException;
	
//	public List<Booking> viewBooking(int bookingid) throws BookingException;
   public Booking findAllBookingId(int bookingId) throws BookingException;
	
	
	public List<Booking> findAllBookings() throws BookingException;
	
	
	public Booking deleteBookingById(int bookingId) throws BookingException;
	
	
	

}
