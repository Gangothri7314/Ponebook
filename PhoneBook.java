import java.util.*;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.put(name, contact);
        System.out.println("Contact added successfully: " + contact);
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found with name: " + name);
        }
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            System.out.println("All contacts:");
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            Contact removedContact = contacts.remove(name);
            System.out.println("Contact deleted successfully: " + removedContact);
        } else {
            System.out.println("Contact not found with name: " + name);
        }
    }
}
