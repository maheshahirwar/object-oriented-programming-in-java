package com.sample.model;

public class Address {

	public String city;
	public String state;
	public String country;
	public String zipCode;
	public Address(String city, String state, String country, String zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}
}
