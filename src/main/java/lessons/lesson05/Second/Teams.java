package lessons.lesson05.Second;

public class Teams {
    private String name;
    private int points;
    private int credit;

    public Teams(String name, int points){
        this.name = name;
        this.points = 0;
    }

    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }

    public void AddPoints(int credit){
        this.points += credit;
    }
}