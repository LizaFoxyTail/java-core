package lessons.lesson12.StreamAPI;

import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1,2,3,4,5,6);
        for(int n : numbers1) {
            if(n%2==0) {
                System.out.println(n*n);
            }
            else continue;
        }
        List<Integer> numbers2 = List.of(1,2,3,4,5,6);
        numbers2.stream()
            .filter(n -> n%2==0)
            .map(n -> n*n)
            .forEach(System.out::println);
    }
}
