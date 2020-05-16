package com.cg.fms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="airport_tbl")
public class Airport {

	@Id
	@Column(name="acode")
	private String airport_code;
	@Column(name="aname")
	private String airport_name;
	@Column(name="alocation")
	private String airport_location;
	
	@OneToMany(mappedBy = "sourceAirport")
	@JsonIgnore
	
	List<Schedule> source_list = new ArrayList<>();
	
	@OneToMany(mappedBy = "destAirport")
	@JsonIgnore
	List<Schedule> dest_list = new ArrayList<>();

	public String getAirport_code() 
	{
		return airport_code;
	}
	public List<Schedule> getSource_list() {
		return source_list;
	}
	public void setSource_list(List<Schedule> source_list) {
		this.source_list = source_list;
	}
	public List<Schedule> getDest_list() {
		return dest_list;
	}
	public void setDest_list(List<Schedule> dest_list) {
		this.dest_list = dest_list;
	}
	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public String getAirport_location() {
		return airport_location;
	}
	public void setAirport_location(String airport_location) {
		this.airport_location = airport_location;
	}
	
}
