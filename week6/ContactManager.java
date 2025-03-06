/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter group: ");
        String group = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        try {
            Contact contact = new Contact(fullName, group, address, phone);
            contacts.add(contact);
            System.out.println("Contact added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        System.out.printf("%-5s %-20s %-15s %-15s %-10s %-20s %-15s%n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public void deleteContact() {
        System.out.print("Enter contact ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean removed = contacts.removeIf(contact -> contact.getId() == id);
        if (removed) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("No found contact.");
        }
    }
}

