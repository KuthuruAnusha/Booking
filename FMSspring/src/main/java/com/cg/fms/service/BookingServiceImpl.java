package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.AirportDao;
import com.cg.fms.dao.BookingDao;
import com.cg.fms.dao.LoginDao;
import com.cg.fms.dao.PassengerDao;
import com.cg.fms.entity.Airport;
import com.cg.fms.entity.Booking;
import com.cg.fms.entity.BookingInfo;
import com.cg.fms.entity.Login;
import com.cg.fms.entity.Passenger;

import com.cg.fms.exception.AirportException;
import com.cg.fms.exception.BookingException;



@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingDao bookingDao;
	@Autowired
	PassengerDao passengerDao;
	@Autowired
	LoginDao loginDao;
	@Autowired
	AirportDao airportDao;


	@Override
	public Booking addBooking(BookingInfo info) throws BookingException {
		Booking book=info.getBooking();
		Passenger pass=info.getPassenger();
		System.out.println(book);
		System.out.println(pass);
		passengerDao.saveAndFlush(pass);
		System.out.println(pass.getId());
		System.out.println(book.getPassenger());
		book.setPassenger(pass);
		bookingDao.saveAndFlush(book);
		return book;
	}
		
	@Override
	public List<Booking> findAllBookings() throws BookingException {
		return  bookingDao.findAll();
		
	}
	
	

	@Override
	public Booking deleteBookingById(int bookingId) throws BookingException {
		Booking bk=null;
		if(bookingDao.existsById(bookingId))
		{
			bk=bookingDao.findById(bookingId).get();
			bookingDao.deleteById(bookingId);
		}
		else
		{
			throw new BookingException("ID NOT FOUND");
		}

		return bk;
		
	}
	


	@Override
	public Booking findAllBookingId(int bookingId) throws BookingException {
		Booking bk=null;
		if(bookingDao.existsById(bookingId))
		{
			bk=bookingDao.findById(bookingId).get();
			
		}
		else
		{
			throw new BookingException(bookingId+"ID NOT FOUND");
		}

		return bk;
		
	}

	@Override
	public Login findUser(String username, String password) throws BookingException {
		
		return loginDao.findUser(username,password);
	}

	@Override
	public List<Airport> findAllAP() throws AirportException {
		return  airportDao.findAll();
	}

	
}




	

	
	
		
		
	


