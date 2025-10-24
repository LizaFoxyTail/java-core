package lessons.lesson12.StreamAPI;

import java.util.List;

public class Two {
    public static void main(String[] args) {
        List<String> words1 = List.of("apple", "banana", "pear", "pineapple");
        int count = 0;
        for (String word : words1) {
            if (word.length()>5) {
                count++;
            }
        }
        System.out.println(count);

        List<String> words2 = List.of("apple", "banana", "pear", "pineapple");
        words2.stream()
            .filter(n -> n.length()>5)
            .count();
        System.out.println(count);
    }
}
