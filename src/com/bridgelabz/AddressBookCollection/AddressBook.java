package com.bridgelabz.AddressBookCollection;

import java.util.Scanner;

public class AddressBook {
        Scanner sc = new Scanner(System.in);
        ContactPerson contacts = new ContactPerson();

        public void addContact() {

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
                displayContact(contacts);
                editContact();
        }

        public void editContact() {
                System.out.println("Enter the First Name : ");
                String firstName = sc.next();

                if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
                        System.out.println("The Entered Contact Name is Not Available in Address Book");
                } else {
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
                        System.out.println("Enter the Zip Code :");
                        contacts.setZipCode(sc.nextInt());
                }
        }
        public void deleteContact(ContactPerson contacts) {
                contacts.setFirstName(null);
                contacts.setLastName(null);
                contacts.setEmailID(null);
                contacts.setAddress(null);
                contacts.setCity(null);
                contacts.setPhoneNumber(0);
                contacts.setZipCode(0);
                displayContact(contacts);
        }
        public void displayContact (ContactPerson contacts){
                        System.out.println(contacts);
        }

}