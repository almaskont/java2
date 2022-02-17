package homework3;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("cow");
        words.add("cat");
        words.add("dog");
        words.add("horse");
        words.add("pig");
        words.add("sheep");
        words.add("cow");
        words.add("cow");
        words.add("horse");
        words.add("cow");
        words.add("cow");
        words.add("sheep");
        words.add("cat");
        words.add("dog");
        words.add("dog");
        //turning list to stream and stream has distinct methods that removes all duplicate values
        System.out.println("Using Stream: " + words.stream().distinct().count());
        //adding everything to Set that does not have duplicate values
        HashSet<String> nonDuplicateWords = new HashSet<>();
        for(String s : words) nonDuplicateWords.add(s);
        System.out.println("Using Set: " + nonDuplicateWords.size());

        int cow = 0;
        int cat = 0;
        int dog = 0;
        int horse = 0;
        int pig = 0;
        int sheep = 0;
        for(String animal : words) {
            switch (animal) {
                case "cow" -> cow++;
                case "cat" -> cat++;
                case "dog" -> dog++;
                case "horse" -> horse++;
                case "pig" -> pig++;
                case "sheep" -> sheep++;
            }
        }
        System.out.printf("cow: %d%ncat: : %d%ndog: %d%nhorse: %d%npig: %d%nsheep: %d%n",cow, cat, dog, horse, pig, sheep);

        Phonebook pb = new Phonebook();
        pb.add("Lee", "123456");
        pb.add("Bean", "123457");
        pb.add("Musk", "123458");
        pb.add("Bezos", "123459");
        pb.add("Buffet", "123451");
        pb.add("Lee", "123452");
        pb.add("Buffet", "123453");
        pb.add("Lee", "123454");
        pb.get("Lee");
    }
}
