package com.cg.fms.entity;


	import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cg.fms.exception.BookingException;

	

	@Entity
	@Table(name="booking_tbl")
	public class Booking {
		@Id
		@Column(name="booking_id", length=10)
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="booking_seq",allocationSize=1)
		private int bookingId;
		
		@Column(name="booking_date")
		private LocalDate bookingDate;
		@Column(name="no_of_seats")
		private int noOfSeats;
		@Column(name="ticket_cost")
		private int cost;
		
		//@OneToMany(mappedBy = "booking")
//		private List<Passenger> passengerList=new ArrayList<Passenger>();
//		
//		
//		
//		
//		public List<Passenger> getPassengerList() {
//			return passengerList;
//		}
//		public void setPassengerList(List<Passenger> passengerList) {
//			this.passengerList = passengerList;
//		}
		@ManyToOne
		@JoinColumn(name="user_id")
		//private User user = new User();
		private User user;
		@ManyToOne
		@JoinColumn(name="sch_id")
		private Schedule schedule;
		//private Schedule schedule = new Schedule();
		
////		@ManyToOne(cascade = CascadeType.ALL)
////		@JoinColumn(name="fnumber")
////		private Flight flight;
////		
		@ManyToOne
		@JoinColumn(name="pid")
		private Passenger passenger;
		
		public Passenger getPassenger() {
			return passenger;
		}
		public void setPassenger(Passenger passenger) {
			this.passenger = passenger;
		}
//		public Flight getFlight() {
//			return flight;
//		}
//		public void setFlight(Flight flight) {
//			this.flight = flight;
//		}
		public int getBookingId() {
			return bookingId;
		}
		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}
		public int getNoOfSeats() {
			return noOfSeats;
		}
		public void setNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}
		public LocalDate getBookingDate() {
			return bookingDate;
		}
		public void setBookingDate(LocalDate bookingDate) {
			this.bookingDate = bookingDate;
		}
		
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
	public User getUser() {
		return user;
	}
		public void setUser(User user) {
			this.user = user;
		}
		public Schedule getSchedule() {
			return schedule;
		}
		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}
		@Override
		public String toString() {
			return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", noOfSeats=" + noOfSeats
					+ ", cost=" + cost + ", user=" + user + ", schedule=" + schedule + ", passenger=" + passenger + "]";
		}
		
		
		
	}
//	
////	}
	