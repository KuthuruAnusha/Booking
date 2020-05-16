package com.cg.fms.entity;

	import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

	
	@Entity

	@Table(name="passenger_tbl")
	
	public class Passenger {

		@Override
		public String toString() {
			return "Passenger [id=" + id + ", passengerName=" + passengerName + ", age=" + age + ", gender=" + gender
					+ "]";
		}
		@Id
		
		@Column(name="pid")
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="passenger_sequence",allocationSize=1)
		private int id;
		
		@Column(name="passenger_name", length=25)
		private String passengerName;
		
		@Column(name="passenger_age")
		private int age;
		
		@Column(name="gender", length=10)
		private String gender;
		
		
//		@ManyToOne(cascade = CascadeType.ALL)
//		@JoinColumn(name="booking_id")
		@JsonIgnore
		//private Booking booking = new Booking();
//		private Booking booking;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
//		public Booking getBooking() {
//			return booking;
//		}
//		public void setBooking(Booking booking) {
//			this.booking = booking;
//		}
		
		
	}


