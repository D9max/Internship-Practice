import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private Map<String, Contact> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String email, String phone) {
        Contact newContact = new Contact(name, email, phone);
        contacts.put(name, newContact);
    }

    public void editContact(String name, String email, String phone) {
        Contact existingContact = contacts.get(name);
        if (existingContact != null) {
            existingContact.setEmail(email);
            existingContact.setPhone(phone);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        Contact removedContact = contacts.remove(name);
        if (removedContact != null) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact(String name) {
        Contact foundContact = contacts.get(name);
        if (foundContact != null) {
            System.out.println(foundContact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private class Contact {
        private String name;
        private String email;
        private String phone;

        public Contact(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String toString() {
            return "Name: " + name + ", Email: " + email + ", Phone: " + phone;
        }
    }
}
