package com.amsidh.hibernate.domains;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="VEHICLE")
public class Vehicle {

	@GeneratedValue
	@Id
	@Column(name = "VEHICLE_ID")
	private Integer vehicleId;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	@ManyToMany(mappedBy="vehicleList")
	Collection<UserDetails> listOfUserDetails=new ArrayList<UserDetails>(); 
	
	
	
	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Collection<UserDetails> getListOfUserDetails() {
		return listOfUserDetails;
	}

	public void setListOfUserDetails(Collection<UserDetails> listOfUserDetails) {
		this.listOfUserDetails = listOfUserDetails;
	}

	
}
