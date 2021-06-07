package com.company;

public class Farmer extends Person {


    public Farmer (String name,  int strength, int health, int stamina, int speed, int attackPower) {
       super(name,75, 100,75,10,1 );
    }

    public Farmer(){
        super();
    }
    public void plow(){
        System.out.println("It's time to plow");
    }
    public void harvest(){
        System.out.println("It's Harvesting Time!");
    }

    @Override
    public String toString() {
        return "Farmer{}";
    }
}
