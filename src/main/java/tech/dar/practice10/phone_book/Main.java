package tech.dar.practice10.phone_book;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactBook contactBook = new ContactBook();

        Scanner scanner = new Scanner(System.in);
        System.out.println("COMMANDS");
        System.out.println("1 - Create contact");
        System.out.println("2 - View all contacts");
        System.out.println("3 - Update contact");
        System.out.println("4 - Search contact by name");

        while (true) {
            try {
                int command = scanner.nextInt(); // CREATE, VIEW ALL, UPDATE, SEARCH
                scanner.nextLine();
                switch (command) {
                    // CREATE
                    case 1 -> {
                        System.out.print("Enter the name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the phone: ");
                        String phone = scanner.nextLine();
                        Contact contact = contactBook.createContact(name, phone);
                        System.out.println("New contact created:");
                        contact.print();
                    }
                    // VIEW ALL
                    case 2 -> {
                        contactBook.printAll();
                    }
                    // EDIT
                    case 3 -> {
                        int id;
                        Contact contact;
                        do {
                            System.out.print("Enter the ID of contact or -1 to break: ");
                            id = scanner.nextInt();
                            scanner.nextLine();
                            contact = contactBook.getById(id);
                        } while (contact == null && id != -1);

                        if (id == -1) break;
                        contact.print();

                        System.out.print("Enter the new name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the new phone: ");
                        String phone = scanner.nextLine();
                        contactBook.updateContact(contact, name, phone).print();
                    }
                    // SEARCH BY NAME
                    case 4 -> {
                        System.out.print("Enter the part of name: ");
                        String str = scanner.nextLine();
                        contactBook.searchByName(str);
                    }
                    default -> System.out.println("Unknown command: " + command);
                }


            } catch (InputMismatchException e) {
                System.out.println("Got an exception, ignoring");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Got an unknown exception:");
                scanner.nextLine();
                e.printStackTrace();
            }
        }

    }
}
