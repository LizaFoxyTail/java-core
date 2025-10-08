package lessons.lesson03.OtherTasks;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Здравствуйте! Меня зовут " + name + ", мне " + age + " лет");
    }
}
