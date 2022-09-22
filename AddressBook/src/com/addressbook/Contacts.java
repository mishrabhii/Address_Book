package com.addressbook;

public class Contacts {

	String firstName;
	String lastName;
	String state;
	String city;
	int pincode;
	String phoneNumber;
	String emailID;

	public Contacts(String firstName, String lastName, String state, String city, int pincode, String phoneNumber,
			String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", state=" + state + ", city=" + city
				+ ", pincode=" + pincode + ", phoneNumber=" + phoneNumber + ", emailID=" + emailID + "]";
	}

	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;

	}
}