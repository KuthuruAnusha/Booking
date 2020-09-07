
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
		private int flightNumber;
		
		@Column(name="fmodel")
		private String flightModel;
		
		@Column(name="carrier_name")
		private String carrierName;
		
		@Column(name="seat_capacity")
		private int seatCapacity;
		
		@OneToMany(mappedBy = "flight")
		@JsonIgnore
		List<Schedule> list = new ArrayList<>();
		public int getflightNumber() {
			return flightNumber;
		}
		public void setflightNumber(int flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getflightModel() {
			return flightModel;
		}
		public void setflightModel(String flightModel) {
			this.flightModel = flightModel;
		}
		public List<Schedule> getList() {
			return list;
		}
		public void setList(List<Schedule> list) {
			this.list = list;
		}
		public String getcarrierName() {
			return carrierName;
		}
		public void setcarrierName(String carrierName) {
			this.carrierName = carrierName;
		}
		public int getseatCapacity() {
			return seatCapacity;
		}
		public void setseatCapacity(int seatCapacity) {
			this.seatCapacity = seatCapacity;
		}
		

	}


