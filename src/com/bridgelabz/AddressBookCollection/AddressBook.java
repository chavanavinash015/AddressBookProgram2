package com.bridgelabz.AddressBookCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
        ArrayList<ContactPerson> addressBook = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ContactPerson contacts = new ContactPerson();

        public void manageAddressBook() {
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
                                        addContact();
                                        break;
                                case 2:
                                        editContact();
                                        break;
                                case 3:
                                        deleteContact();
                                        break;
                                case 4:
                                        displayAddressBook();
                                        break;
                                case 5:
                                        System.out.println("Exit");
                                        break;

                        }
                } while (choice != 5);
        }

        public ContactPerson getContactsToModify(String name) {
                ContactPerson contact = null;
                for (int i = 0; i < addressBook.size(); i++) {
                        ContactPerson temp = addressBook.get(i);
                        if (name.equalsIgnoreCase(temp.getFirstName())) {
                                contact = temp;
                        }
                }
                return contacts;

        }

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
                addressBook.add(contacts);

        }

        @Override
        public String toString() {
                return "AddressBook{" +
                        "addressBook=" + addressBook +
                        ", sc=" + sc +
                        ", contacts=" + contacts +
                        '}';
        }

        public void editContact() {
                System.out.println("Enter the First Name for edit Contact");
                String firstName = sc.next();
                for (int i = 0; i < addressBook.size(); i++) {
                        if (addressBook.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                                addressBook.remove(i);
                                addContact();
                        } else {
                                System.out.println("data not found ");
                        }
                }
                sc.close();
        }

        public void deleteContact() {
                ContactPerson contact = null;
                String name = null;

                System.out.print("\nEnter the First Name of the contact you want to delete : ");
                name = sc.next();
                while (contact == null) {
                        contact = getContactsToModify(name);
                        if (contact == null) {
                                System.out.println("\nNo such entry exists!\nPlease enter a valid First Name.");
                                name = sc.next();
                                contact = getContactsToModify(name);
                        }
                }
                addressBook.remove(contact);
        }

        public void addMultipleContact() {
                System.out.println("enter number of contacts");
                int numofAddressBook = sc.nextInt();
                int  person = 1;
                while( person <= numofAddressBook){
                        addContact();
                        person++;
                }

        }
        public void displayAddressBook() {
                System.out.println("\n\n------- Address Book -------");
                for (int i = 0; i < addressBook.size(); i++)
                        System.out.println("\n"+addressBook.get(i));
                System.out.println();
        }
        public void displayContact (){
                        System.out.println(contacts);
        }

}