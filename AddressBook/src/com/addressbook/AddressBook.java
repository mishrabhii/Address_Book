package com.addressbook;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program in Java");
		AddressBook add = new AddressBook();
		add.addContact();
	}

	public  void addContact() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first name");
		String firstName = sc.next();

		System.out.println("enter last name");
		String lastName = sc.next();

		System.out.println("enter state name");
		String stateName = sc.next();

		System.out.println("enter city name");
		String cityName = sc.next();

		System.out.println("enter pinCode name");
		int pinCode = sc.nextInt();

		System.out.println("enter phoneNumber name");
		String phoneNumber = sc.next();

		System.out.println("enter emailId name");
		String emailId = sc.next();


		Contacts newContact = new Contacts(); 
		newContact.setFirstName(firstName);
		newContact.setLastName(lastName);
		newContact.setState(stateName);
		newContact.setCity(cityName);
		newContact.setPincode(pinCode);
		newContact.setPhoneNumber(phoneNumber);
		newContact.setEmailID(emailId);

		sc.close();
	}

	public void displayContacts(Contacts contacts) {
		System.out.println(contacts);
	}
}


