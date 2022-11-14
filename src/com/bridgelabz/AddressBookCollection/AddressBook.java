package com.bridgelabz.AddressBookCollection;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    public void addContact(){

            ContactPerson contacts=new ContactPerson();
            System.out.println("Enter the Contact Details :-");
            System.out.println("Enter the First Name :");
            contacts.setFirstName(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastName(sc.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmailID(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(sc.nextLong());
            System.out.println("Enter the PIN Code :");
            contacts.setZipCode(sc.nextInt());
            System.out.println("Contacts Added Successfully");


    }
}
