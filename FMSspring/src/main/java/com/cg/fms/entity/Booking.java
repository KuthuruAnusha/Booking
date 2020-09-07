package com.cg.fms.entity;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




	@Entity
	@Table(name="booking_tbl")
	public class Booking {
		@Id
		@Column(name="booking_id", length=10)
		
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="booking_seq",allocationSize=1)
		private int bookingId;
		
		@Column(name="booking_date")
		private LocalDate bookingDate;
		@Column(name="no_of_seats")
		private int noOfSeats;
		@Column(name="ticket_cost")
		private int cost;
		
		
		public Booking() {
			super();
		}
		public Booking(int bookingId, LocalDate bookingDate, int noOfSeats, int cost
				) {
			super();
			this.bookingId = bookingId;
			this.bookingDate = bookingDate;
			this.noOfSeats = noOfSeats;
			this.cost = cost;
			
		}
		@ManyToOne
		@JoinColumn(name="user_id")
		
		private User user;
		@ManyToOne
		@JoinColumn(name="sch_id")
		private Schedule schedule;
		
		
		@ManyToOne
		@JoinColumn(name="pid")
		private Passenger passenger;
		


		
		
		public Passenger getPassenger() {
			return passenger;
		}
		public void setPassenger(Passenger passenger) {
			this.passenger = passenger;
		}
	
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

	