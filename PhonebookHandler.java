package template;

import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{

    public PhonebookHandler(Map phonebook) {
        phonebook = new HashMap<>();
    }

    public List<Contact> sortByName() {
        return null;
    }

    public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
        return null;
    }

    public void display(List<Contact> sortedContacts) {

    }
 
}
