package lessons.lesson03.StreetFighter;

import java.util.Random;

public class Fighter {
    private int code;
    private String name;
    private int health;
    private int attack;

    public Fighter(int code, String name, int health, int attack) {
        this.code = code;
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void getFighterInfo(){
        System.out.println("Fighter: " + name + " " + "Health: " + health);
    }

    public void fight(Fighter enemy){
        System.out.println("Fighter: " + name + " " + "VS: " + enemy.name);
        Random rand = new Random();
        int first = rand.nextInt(2);

        if(first==0){
            System.out.println(this.name + " attacks first ");
        }
        else{
            System.out.println(enemy.name + " attacks first ");
        }

        while(this.health > 0 && enemy.health > 0 ){
            if(first==0){
                enemy.health -= this.attack;
                System.out.println(this.name + " doing damage " + this.attack + " and " + enemy.name + " now has " + enemy.health + "hp");
                first = 1;
            }
            else {
                this.health -= enemy.attack;
                System.out.println(enemy.name + " doing damage " + enemy.attack + " and " + this.name + " now has " + this.health + "hp");
                first = 0;
            }
        }
        if (this.health>0){
            System.out.println(this.name + " wins!");
        }
        else{
            System.out.println(enemy.name + " wins!");
        }
    }

}
