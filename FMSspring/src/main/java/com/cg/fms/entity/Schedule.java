
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
	@Table(name="schedule_tbl")
	public class Schedule {
		@Id
		@Column(name="sch_id")
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="schedule_seq",allocationSize=1)
		private int scheduleId;
		
		@ManyToOne
		@JoinColumn(name="sairport")
		private Airport sourceAirport;
		
		@ManyToOne
		@JoinColumn(name="dairport")
		private Airport destAirport;
		
		@Column(name="arr_dat_time")
		private LocalDate arrivalDate;
		public Schedule() {
			super();
		}


		public Schedule(int scheduleId, Airport sourceAirport, Airport destAirport, LocalDate arrivalDate,
				LocalDate departureDate, String arrivalTime, String departureTime, Flight flight) {
			super();
			this.scheduleId = scheduleId;
			this.sourceAirport = sourceAirport;
			this.destAirport = destAirport;
			this.arrivalDate = arrivalDate;
			this.departureDate = departureDate;
			this.arrivalTime = arrivalTime;
			this.departureTime = departureTime;
			this.flight = flight;
		}


		@Column(name="dept_dat_time")
		private LocalDate departureDate;
		
		@Column(name="time")
		private String arrivalTime;
		@Column(name="dtime")
		private String departureTime;
		
		public String getDepartureTime() {
			return departureTime;
		}


		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}


		public String getArrivalTime() {
			return arrivalTime;
		}


		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}


		@ManyToOne
		@JoinColumn(name="fnumber")
		private Flight flight;
		



		public int getScheduleId() {
			return scheduleId;
		}


		public void setScheduleId(int scheduleId) {
			this.scheduleId = scheduleId;
		}


		public Airport getSourceAirport() {
			return sourceAirport;
		}


		public void setSourceAirport(Airport sourceAirport) {
			this.sourceAirport = sourceAirport;
		}


		public Airport getDestAirport() {
			return destAirport;
		}


		public void setDestAirport(Airport destAirport) {
			this.destAirport = destAirport;
		}


		public LocalDate getArrivalDate() {
			return arrivalDate;
		}


		public void setArrivalDate(LocalDate arrivalDate) {
			this.arrivalDate = arrivalDate;
		}


		public LocalDate getDepartureDate() {
			return departureDate;
		}


		public void setDepartureDate(LocalDate departureDate) {
			this.departureDate = departureDate;
		}


		public Flight getFlight() {
			return flight;
		}


		public void setFlight(Flight flight) {
			this.flight = flight;
		}
		
		
		

	}

