# Phone Book Application

A simple Java console-based phone book application to manage contacts (name and phone number).

## Features

- Add a new contact
- Search for a contact
- Display all contacts
- Delete a contact

## Usage

1. Compile the Java files:
   javac Contact.java PhoneBook.java PhoneBookApplication.java
2. Run the application:
java PhoneBookApplication
3. 
Follow the prompts to use the phone book functionalities.
Phone Book Application
1. Add Contact
2. Search Contact
3. Display All Contacts
4. Delete Contact
5. Exit
Enter your choice: 1
Enter contact name: John Doe
Enter contact phone number: 1234567890
Contact added successfully: Name: John Doe, Phone Number: 1234567890

Phone Book Application
1. Add Contact
2. Search Contact
3. Display All Contacts
4. Delete Contact
5. Exit
Enter your choice: 3
All contacts:
Name: John Doe, Phone Number: 1234567890

Phone Book Application
1. Add Contact
2. Search Contact
3. Display All Contacts
4. Delete Contact
5. Exit
Enter your choice: 5
Exiting Phone Book Application. Goodbye!

-->Explanation:
1. Contact Class: Represents a contact with name and phoneNumber. Provides getters for these properties.

2. PhoneBook Class: Manages contacts using a HashMap where the key is the name of the contact and the value is a Contact object.

addContact(String name, String phoneNumber): Adds a new contact to the phone book.
searchContact(String name): Searches for a contact by name.
displayAllContacts(): Displays all contacts stored in the phone book.
deleteContact(String name): Deletes a contact by name.
PhoneBookApplication Class: Contains the main method to test the PhoneBook class functionalities.

3. Creates a PhoneBook object.
Adds contacts, displays all contacts, searches for contacts, deletes a contact, and displays all contacts again to verify deletion.
4. How to Run:
Compile the PhoneBookApplication.java file using javac PhoneBookApplication.java.
Run the compiled PhoneBookApplication class using java PhoneBookApplication.
This basic example covers essential functionalities of a phone book application in Java. Depending on your requirements, you can extend this by adding more features like editing contacts, saving contacts to a file, or using a database for storage.