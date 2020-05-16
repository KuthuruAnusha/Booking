
	package com.cg.fms.entity;

	import java.util.ArrayList;
	import java.util.List;

	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

	import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name="flight_tbl")
	public class Flight {
		
		@Id
		@Column(name="fnumber")
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="flight_sequence",allocationSize=1)
		//@GeneratedValue(strategy = GenerationType.AUTO)
		private int flight_number;
		@Column(name="fmodel")
		private String flight_model;
		@Column(name="carrier_name")
		private String carrier_name;
		@Column(name="seat_capacity")
		
		private int seat_capacity;
		
		@OneToMany(mappedBy = "flight")
		@JsonIgnore
		List<Schedule> list = new ArrayList<>();
		public int getFlight_number() {
			return flight_number;
		}
		public void setFlight_number(int flight_number) {
			this.flight_number = flight_number;
		}
		public String getFlight_model() {
			return flight_model;
		}
		public void setFlight_model(String flight_model) {
			this.flight_model = flight_model;
		}
		public List<Schedule> getList() {
			return list;
		}
		public void setList(List<Schedule> list) {
			this.list = list;
		}
		public String getCarrier_name() {
			return carrier_name;
		}
		public void setCarrier_name(String carrier_name) {
			this.carrier_name = carrier_name;
		}
		public int getSeat_capacity() {
			return seat_capacity;
		}
		public void setSeat_capacity(int seat_capacity) {
			this.seat_capacity = seat_capacity;
		}
		

	}


