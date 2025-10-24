package lessons.lesson12.FuncInterface;

import java.util.function.Consumer;

public class Seven {
    public static void main(String[] args) {
        Consumer<String> consumerText = s -> System.out.println(s);
        Consumer<String> consumerLength = i -> System.out.println(i.length());
        consumerText.andThen(consumerLength).accept("Hello World");
    }
}
