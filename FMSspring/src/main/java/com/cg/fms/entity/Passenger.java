package com.cg.fms.entity;

	
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
		
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="passenger_sequence",allocationSize=1)
		private int id;
		
		public Passenger() {
			super();
		}
		public Passenger(int id, String passengerName, int age, String gender) {
			super();
			this.id = id;
			this.passengerName = passengerName;
			this.age = age;
			this.gender = gender;
		}
		@Column(name="passenger_name", length=25)
		private String passengerName;
		
		@Column(name="passenger_age")
		private int age;
		
		@Column(name="gender", length=10)
		private String gender;
		
		

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
		
	}


