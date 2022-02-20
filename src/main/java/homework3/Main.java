package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        firstTask();

        secondTask();
    }

    private static void firstTask() {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "cow", "cat", "dog", "horse", "pig",
                "sheep", "cow", "cow", "chicken", "chicken", "chicken", "pig");
        //turning list to stream and stream has distinct methods that removes all duplicate values
        System.out.println("Using Stream: " + words.stream().distinct().count());
        //adding everything to Set that does not have duplicate values
        HashSet<String> nonDuplicateWords = new HashSet<>(words);
        System.out.println("Using Set: " + nonDuplicateWords.size());

        for (String s : nonDuplicateWords) {
            System.out.println(s + ": " + words.stream().filter(e -> e.equals(s)).count());
        }
    }

    private static void secondTask() {
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
