package lessons.lesson12.StreamAPI;

import java.util.List;

public class Four {
    public static void main(String[] args) {
        List<String> names1 = List.of("Alice", "Bob", "Charlie", "David");
        int count = 0;
        for (String name : names1) {
            count += name.length();
        }
        double average = (double) count / names1.size();
        System.out.println("Average is " + average);


        List<String> names2 = List.of("Alice", "Bob", "Charlie", "David");
        double average1 = (double) names2.stream()
            .mapToInt(String::length)
            .sum() / names2.size();
        System.out.println("Average is " + average1);
    }
}