package com.cg.fms.entity;

public class BookingInfo {
	Booking booking;
	Passenger passenger;
	
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public BookingInfo() {
		super();
	}
	@Override
	public String toString() {
		return "BookingInfo [booking=" + booking + ", passenger=" + passenger + "]";
	}
	public BookingInfo(Booking booking, Passenger passenger) {
		super();
		this.booking = booking;
		this.passenger = passenger;
	}

}
