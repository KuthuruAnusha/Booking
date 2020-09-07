package com.cg.fms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="airport_tbl")
public class Airport {

	@Id
	@Column(name="acode")
	private String airportCode;
	@Column(name="aname")
	private String airportName;
	@Column(name="alocation")
	private String airportLocation;
	
	@OneToMany(mappedBy = "sourceAirport")
	@JsonIgnore
	
	List<Schedule> sourceList = new ArrayList<>();
	@Transient
	private int count=sourceList.size();
	public int getCount()
	{
		return sourceList.size();
	}
	
	
	@OneToMany(mappedBy = "destAirport")
	@JsonIgnore
	List<Schedule> destList = new ArrayList<>();

	public Airport() {
		super();
	}
	public Airport(String airportCode, String airportName, String airportLocation) {
		super();
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
	}
	public String getairportCode() 
	{
		return airportCode;
	}
	public void setairportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public List<Schedule> getsourceList() {
		return sourceList;
	}
	public void setsourceList(List<Schedule> sourceList) {
		this.sourceList = sourceList;
	}
	public List<Schedule> getdestList() {
		return destList;
	}
	public void setdestList(List<Schedule> destList) {
		this.destList = destList;
	}
	
	public String getairportName() {
		return airportName;
	}
	public void setairportName(String airportName) {
		this.airportName = airportName;
	}
	public String getairportLocation() {
		return airportLocation;
	}
	public void setairportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	
	
}
