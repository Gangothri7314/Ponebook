import java.util.Scanner;

public class PhoneBookApplication {
    private static final PhoneBook phoneBook = new PhoneBook();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Phone Book Application");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    displayAllContacts();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Phone Book Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addContact(name, phoneNumber);
    }

    private static void searchContact() {
        System.out.print("Enter contact name to search: ");
        String name = scanner.nextLine();
        phoneBook.searchContact(name);
    }

    private static void displayAllContacts() {
        phoneBook.displayAllContacts();
    }

    private static void deleteContact() {
        System.out.print("Enter contact name to delete: ");
        String name = scanner.nextLine();
        phoneBook.deleteContact(name);
    }
}

