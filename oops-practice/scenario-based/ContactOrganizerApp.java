import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class ContactOrganizer {

    private List<Contact> contactList = new ArrayList<>();

    public boolean addContact(String name, String phone) throws InvalidPhoneNumberException {

        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new InvalidPhoneNumberException("Phone number should contain exactly 10 digits");
        }

        for (Contact c : contactList) {
            if (c.phone.equals(phone)) {
                return false;
            }
        }

        contactList.add(new Contact(name, phone));
        return true;
    }

    public boolean deleteContact(String phone) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).phone.equals(phone)) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Contact searchContact(String phone) {
        for (Contact c : contactList) {
            if (c.phone.equals(phone)) {
                return c;
            }
        }
        return null;
    }
}

public class ContactOrganizerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactOrganizer organizer = new ContactOrganizer();

        try {
            boolean added = organizer.addContact("Aryan", "9876543210");
            if (added) {
                System.out.println("Contact added");
            } else {
                System.out.println("Duplicate contact");
            }

            Contact found = organizer.searchContact("9876543210");
            if (found != null) {
                System.out.println("Found: " + found.name + " - " + found.phone);
            } else {
                System.out.println("Contact not found");
            }

            boolean deleted = organizer.deleteContact("9876543210");
            if (deleted) {
                System.out.println("Contact deleted");
            } else {
                System.out.println("No contact to delete");
            }

        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
