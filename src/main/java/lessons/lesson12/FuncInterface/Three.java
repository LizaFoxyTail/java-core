package lessons.lesson12.FuncInterface;

import java.util.UUID;
import java.util.function.Supplier;

public class Three {
    public static void main(String[] args) {
        Supplier<UUID> supplier = () -> UUID.randomUUID();
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}