package com.bridgelabz.AddressBookCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

        Scanner sc = new Scanner(System.in);
        ContactPerson contacts = new ContactPerson();

        public void manageAddressBook(String addressBook, ArrayList<ContactPerson> contactList) {
                int choice = 0;
                do {
                        do {
                                System.out.println("\nWhich of the following operations would you like to perform?");
                                System.out.println("1. Add a New contact");
                                System.out.println("2. Edit an Existing contact");
                                System.out.println("3. Delete an Existing contact");
                                System.out.println("4. Display the Address Book");
                                System.out.println("5. Exit");
                                System.out.print("\nEnter your choice : ");
                                choice = sc.nextInt();

                                if (!(choice >= 1 && choice <= 5))
                                        System.out.println("\nInvalid choice!\nPlease try again.\n");
                        } while (!(choice >= 1 && choice <= 5));
                        switch (choice) {
                                case 1:
                                        addContact(contactList);
                                        break;
                                case 2:
                                        editContact(contactList);
                                        break;
                                case 3:
                                        deleteContact(contactList);
                                        break;
                                case 4:
                                        displayAddressBook(addressBook, contactList);
                                        break;
                                case 5:
                                        System.out.println("Exit");
                                        break;

                        }
                } while (choice != 5);
        }

        public ContactPerson getContactsToModify(String name, ArrayList<ContactPerson> contactList) {
                ContactPerson contact = null;
                for (int i = 0; i < contactList.size(); i++) {
                        ContactPerson temp = contactList.get(i);
                        if (name.equalsIgnoreCase(temp.getFirstName())) {
                                contact = temp;
                        }
                }
                return contacts;

        }

        public void addContact(ArrayList<ContactPerson> contactList) {

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
                contactList.add(contacts);

        }

        public String toString(ArrayList<ContactPerson> contactList) {
                return "AddressBook{" +
                        "addressBook=" + contactList +
                        ", sc=" + sc +
                        ", contacts=" + contacts +
                        '}';
        }

        public void editContact(ArrayList<ContactPerson> contactList) {
                System.out.println("Enter the First Name for edit Contact");
                String firstName = sc.next();
                for (int i = 0; i < contactList.size(); i++) {
                        if (contactList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                               contactList.remove(i);
                                addContact(contactList);
                        } else {
                                System.out.println("data not found ");
                        }
                }
                sc.close();
        }

        public void deleteContact(ArrayList<ContactPerson> contactList) {
                ContactPerson contact = null;
                String name = null;

                System.out.print("\nEnter the First Name of the contact you want to delete : ");
                name = sc.next();
                while (contact == null) {
                        contact = getContactsToModify(name, contactList);
                        if (contact == null) {
                                System.out.println("\nNo such entry exists!\nPlease enter a valid First Name.");
                                name = sc.next();
                                contact = getContactsToModify(name, contactList);
                        }
                }
                contactList.remove(contact);
        }


        public void displayAddressBook(String addressbook, ArrayList<ContactPerson> contactList) {
                System.out.println("Display  Address Book -------");
                for (int i = 0; i < contactList.size(); i++)
                        System.out.println("\n"+contactList.get(i));
                System.out.println();
        }
        public void displayContact (){
                        System.out.println(contacts);
        }

}