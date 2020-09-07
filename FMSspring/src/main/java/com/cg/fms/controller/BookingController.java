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

import com.cg.fms.entity.Airport;
import com.cg.fms.entity.Booking;
import com.cg.fms.entity.BookingInfo;
import com.cg.fms.entity.Login;
import com.cg.fms.exception.AirportException;
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
		   return new ResponseEntity<>(bookings,HttpStatus.OK);
		   
		
	}
	
	@PostMapping("booking")
	public ResponseEntity<Booking> addBooking(@RequestBody BookingInfo info) throws BookingException
	{
		System.out.println(info.getPassenger().getPassengerName());
		Booking b=bookingService.addBooking(info);
		
		return new ResponseEntity<>(b,HttpStatus.OK);
		

	}
	

	@GetMapping("booking")
	public ResponseEntity<List<Booking>> findAllBookings() throws BookingException
	{
		List<Booking> list = bookingService.findAllBookings();
		return new ResponseEntity<>(list,HttpStatus.OK);
		
			}

	@DeleteMapping("booking/{id}")
	public ResponseEntity<Booking> deleteBookingById(@PathVariable("id") int bookingId) throws BookingException
	{

		ResponseEntity<Booking>  kb= null;
		
		
	    Booking be = bookingService.deleteBookingById (bookingId);
		 new ResponseEntity<Booking>(be,HttpStatus.OK);
		
		return kb;
	}
	@GetMapping("admin/login/{user}/{pass}")
	public ResponseEntity<Login>  findUserLogin(@PathVariable("user") String username, @PathVariable("pass") String password) throws BookingException
	{
	  
		 Login log = bookingService.findUser(username,password);
		 if(log==null) {
			 throw new BookingException("Login not successful");
		 }
		 return new ResponseEntity<>(log,HttpStatus.OK);
		
		
	}
	@GetMapping("airport")
	public ResponseEntity<List<Airport>> findAllAP() throws AirportException
	{
		List<Airport> list = bookingService.findAllAP();
		return new ResponseEntity<>(list,HttpStatus.OK);
		
			}
	
	
	}

























