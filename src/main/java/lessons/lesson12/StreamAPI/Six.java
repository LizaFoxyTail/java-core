package lessons.lesson12.StreamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Six {
   public static void main(String[] args) {
       List<String> fruits = List.of("apple", "banana", "kiwi");
       Map<String, Integer> map = new HashMap<>();

       for(String fruit : fruits) {
           map.put(fruit, fruit.length());
       }
        System.out.println(map);

       Map<String, Integer> map2 = fruits.stream().collect(Collectors.toMap(Function.identity(), l -> l.length()));
       System.out.println(map2);
    }

}
