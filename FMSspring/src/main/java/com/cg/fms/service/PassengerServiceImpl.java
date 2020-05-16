//package com.cg.fms.service;
//
//import com.cg.fms.dao.BookingDao;
//import com.cg.fms.dao.PassengerDao;
//import com.cg.fms.entity.Booking;
//import com.cg.fms.entity.BookingInfo;
//import com.cg.fms.entity.Passenger;
//
//public class PassengerServiceImpl implements PassengerService {
//	PassengerDao passengerDao;
//	BookingDao bookingDao;
//
//
//	@Override
//	public Passenger addBooking(BookingInfo info) {
//		Booking book=info.getBooking();
//		Passenger pass=info.getPassenger();
//		passengerDao.save(pass);
//		book.setId(pass.getId());
//		bookingDao.save(book);
//		return book;
//		
//		
//	}
//	
//	
//
//}
