package lessons.lesson12.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Five {
    public static void main(String[] args) {
        List<String> input = List.of("apple", "pear", "apple", "banana", "pear"); // список не изменяемый, поэтому создала новый
        Set<String> set = new HashSet<>(input);
        List<String> uniqueInput = new ArrayList<>(set);

        uniqueInput.sort(Comparator.comparingInt(String::length));
            for(String s : uniqueInput) {
                System.out.println(s);
            }

            List<String> result = input.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

            result.forEach(System.out::println);
        }
    }
