package homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number) {
        if(phoneBook.containsKey(surname)){
            phoneBook.get(surname).add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(surname, numbers);
        }
    }

    public void get(String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.println(surname + ": " + phoneBook.get(surname).toString());
        } else {
            System.out.println("No contact");
        }
    }
}
