package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    private Map<String, Contact> contacts;
    private Scanner scanner;

    public AddressBook() {
        contacts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    // Add new contact to the address book
    public void addContact() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, phone);

        System.out.println("       Your new contact :    ");
        System.out.println(name + "           " + phone + "\n");
        System.out.println("Do you want to save? Y/N");
        String choice = scanner.nextLine();
        if(choice.equals("Y")) save(name, contact);
    }

    // Find a contact by name
    public void findContactByName() {
        System.out.println("Enter name to find:");
        String name = scanner.nextLine();

        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            System.out.println("Phone number of " + name + " is: " + contact.getPhone());
        } else {
            System.out.println("Not found");
        }
    }

    // Display all contacts in the address book
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("          Address Book");
        } else {
            System.out.println("          Address Book");
            System.out.println("Contact Name       Phone Number");

            for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
                Contact contact = entry.getValue();
                System.out.println(contact.getName() + "           " + contact.getPhone());
            }
        }
    }

    public void save(String name, Contact contact) {
        contacts.put(name, contact);

        System.out.println("Contact added successfully!");
    }
}
