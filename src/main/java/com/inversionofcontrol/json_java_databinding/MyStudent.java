package com.inversionofcontrol.json_java_databinding;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Assume you have bloodgroup in mystudentList.json but we don't define bloodgroup in MyStudent
 * then in such case we use @JsonIgnore(ignoreUnkown =true)
 * @author raipr
 *
 */
// @JsonIgnoreProperties(ignoreUnknown = true)   -- This will ignore the properties of object that are not mapped
@JsonIgnoreProperties(value = {"name","isActive"}, ignoreUnknown = true)

public class MyStudent {
	@JsonProperty("fullName")
	private String name;
	private String address;
	@JsonProperty("isActive")
	private boolean isActive;
	private String [] phoneNo;
	
	private BatchInfo batch;
	
	
	public boolean isActive() { // Always check 
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public BatchInfo getBatch() {
		return batch;
	}
	public void setBatch(BatchInfo batch) {
		this.batch = batch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", address=" + address + ", isActive=" + isActive + ", phoneNo="
				+ Arrays.toString(phoneNo) + ", batch=" + batch + "]";
	}
	
	

}
