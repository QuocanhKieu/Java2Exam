package addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                AddressBook addressBook = new AddressBook();
                Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("\nAddress Book Menu:");
                    System.out.println("1. Add new contact");
                    System.out.println("2. Find a contact by name");
                    System.out.println("3. Display contacts");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice:");

                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (choice) {
                        case 1:
                            addressBook.addContact();
                            break;
                        case 2:
                            addressBook.findContactByName();
                            break;
                        case 3:
                            addressBook.displayContacts();
                            break;
                        case 4:
                            System.out.println("Exiting Address Book !");
                            break;
                        default:
                            System.out.println("Invalid choice! Please enter a valid option.");
                            break;
                    }
                } while (choice != 4);

                scanner.close();
            }
    }
