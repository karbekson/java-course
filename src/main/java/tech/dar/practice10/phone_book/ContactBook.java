package tech.dar.practice10.phone_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ContactBook {

    List<Contact> contacts;

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public Contact createContact(String name, String phone) {
        // check if exists
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
        return contact;
    }

    public Contact getById(int id) {
        return contacts.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public boolean existsById(int id) {
        return contacts.stream().anyMatch(c -> c.getId() == id);
    }

    public Contact updateContact(Contact contact, String name, String phone) {
        contact.setName(name);
        contact.setPhone(phone);
        return contact;
    }

    public void searchByName(String str) {
        contacts.stream()
                .filter(c -> c.getName().toLowerCase().contains(str.toLowerCase()))
                .forEach(Contact::print);
    }

    public void printAll() {
        contacts.forEach(Contact::print);
    }

}
