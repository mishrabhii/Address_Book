package com.addressbook;

import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);

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
		displayContacts(newContact);
		editContacts(newContact);

	}

	public void displayContacts(Contacts contacts) {
		System.out.println(contacts);
		
	}
	public void editContacts(Contacts contacts) {
		int choice = 0;
		while (choice < 1 || choice > 4) {
			System.out.println("do you want to edit");
			System.out.println("1- Name");
			System.out.println("2- State");
			System.out.println("3- City");
			System.out.println("4- PinCode");
			System.out.println("5- Phone Number");
			System.out.println("6- Email Id");
			
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			if (!(choice >=1 && choice <= 4))
				System.out.println("\nInvalid choice!\nPlease try again.\n");
		}
		
		switch (choice) {
		case 1 :
			System.out.print("Enter the updated First Name :  ");
			String firstname = sc.next();
			System.out.print("Enter the updated Last Name :	 ");
			String lastname = sc.next();
			contacts.setFirstName(firstname);
			contacts.setLastName(lastname);
			break;
			
		case 2 :
			System.out.print("Enter new State Name :	");
			String state = sc.next();
			contacts.setState(state);
			break;
			
		case 3 :
			System.out.print("Enter new city name :	");
			String city = sc.next();
			contacts.setCity(city);
			break;
			
			
		case 4 :
			System.out.print("Enter new PinCode :	");
			String pinCode = sc.next();
			contacts.setPincode(choice);
			break;
			
		case 5 :
			System.out.print("Enter new Phone Number :	");
			String phoneNumber = sc.next();
			contacts.setPhoneNumber(phoneNumber);
			break;
			
		case 6 :
			System.out.print("Enter new Email Address :	");
			String email = sc.next();
			contacts.setEmailID(email);
			break;
	
		}
		
		System.out.println("\nIs there anything else you'd like to update?");
		System.out.print("Enter 'Yes' or 'No' : ");
		char continueEdit = sc.next().charAt(0);
		if (continueEdit == 'Y' || continueEdit == 'y') {
			editContacts(contacts);

		}
		else if (continueEdit == 'N' || continueEdit == 'n') {
			System.out.println("\n\nHere is the updated Address Book.");
			displayContacts(contacts);
		}
		else {
			System.out.println("\nInvalid Input.\nPlease try again!");
		}
	}
}
	




