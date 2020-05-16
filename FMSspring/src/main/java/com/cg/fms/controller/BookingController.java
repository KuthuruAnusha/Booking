package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.Booking;
import com.cg.fms.entity.BookingInfo;
import com.cg.fms.exception.BookingException;
import com.cg.fms.service.BookingService;




@RestController
@CrossOrigin("*")
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@GetMapping("booking/{id}")
	public ResponseEntity<Booking> findAllBookingId(@PathVariable("id") int id) throws BookingException 
	{
		Booking  bookings = bookingService.findAllBookingId(id);
		   ResponseEntity<Booking>  bk = new ResponseEntity<>(bookings,HttpStatus.OK);
		   return bk;
		
	}
	
	@PostMapping("booking")
	public ResponseEntity<Booking> addBooking(@RequestBody BookingInfo info) throws BookingException
	{
		System.out.println(info.getPassenger().getPassengerName());
		Booking b=bookingService.addBooking(info);
		
		ResponseEntity<Booking> be=new ResponseEntity<Booking>(b,HttpStatus.OK);
		
	return be;
	}
//	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) throws BookingException
//	{
//		Booking b=bookingService.addBooking(booking);
//		
//		
//		
////		Booking b=bookingService.addBooking(booking);
////		
//	ResponseEntity<Booking> be=new ResponseEntity<Booking>(HttpStatus.OK);
////		
//	return be;
//	}

	@GetMapping("booking")
	public ResponseEntity<List<Booking>> findAllBookings() throws BookingException
	{
		List<Booking> list = bookingService.findAllBookings();
		ResponseEntity<List<Booking>>  kb = new ResponseEntity<List<Booking>>(list,HttpStatus.OK);
		return kb;
			}
//	public List<Booking> findAllBookings() throws BookingException{
//		return bookingService.findAllBookings();	
//	}
//	
	@DeleteMapping("booking/{id}")
	public ResponseEntity<Booking> deleteBookingById(@PathVariable("id") int bookingId) throws BookingException
	{

		ResponseEntity<Booking>  kb= null;
		
		
	    Booking be = bookingService.deleteBookingById (bookingId);
		kb= new ResponseEntity<Booking>(be,HttpStatus.OK);
		
		return kb;
	}
	
	
	}

























