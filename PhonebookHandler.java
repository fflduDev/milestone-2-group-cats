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

    private Map<Contact, List<PhonebookEntry>> phonebook;
    //constructor may be wrong, just fixed the errors
    public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
        this.phonebook = new HashMap<>(phonebook);
    }

    public List<Contact> sortByName() {
        List<Contact> result = new ArrayList<>(phonebook.keySet());


        return result;
    }

    public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
        return null;
    }

    public void display(List<Contact> sortedContacts) {
        System.out.println("[");
        for (int i = 0; i < sortedContacts.size(); i++) {
            System.out.println(sortedContacts.get(i));
            if (i != sortedContacts.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
 
}
