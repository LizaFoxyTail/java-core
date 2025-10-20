package lessons.lesson03.StreetFighter;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(1, "Scorpion", 100, 15);
        Fighter f2 = new Fighter(2, "Shang Tsung", 100, 20);
        f1.fight(f2);
    }
}
