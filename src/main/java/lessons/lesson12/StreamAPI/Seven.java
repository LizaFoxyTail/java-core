package lessons.lesson12.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Seven {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Andrew", "Bob", "Charlie", "Catherine");
        List<String> sortedNames = new ArrayList<>();
        for(String name : names) {
            sortedNames.add(name);
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        sortedNames.sort(comparator);
        System.out.println(sortedNames);

        System.out.println(names.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList()));
    }
}
