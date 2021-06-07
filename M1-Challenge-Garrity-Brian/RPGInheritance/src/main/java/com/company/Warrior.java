package com.company;

import java.util.Objects;

public class Warrior  extends Person {
    public int shieldStrength;


    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, 75, 100, 100, 50, 10);
        setShieldStrength(100);


    }

    public Warrior() {
        super();
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
    public void decreaseShieldStrength(Warrior warrior){
        setShieldStrength(warrior.getShieldStrength()- 1);
        System.out.println("Shield's durability decreased by 1");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}