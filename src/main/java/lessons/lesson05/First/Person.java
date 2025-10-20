package lessons.lesson05.First;

public abstract class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
}
