package homework3;

import java.util.HashMap;

public class Phonebook {
    HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String surname, String number) {
        phoneBook.put(number, surname);
    }
    public void get(String surname) {
        if(phoneBook.containsValue(surname)){
            for(String contact : phoneBook.keySet()) {
                if(phoneBook.get(contact).equals(surname)){
                    System.out.println(contact);
                }
            }
        } else {
            System.out.println("No contact");
        }
    }
}
