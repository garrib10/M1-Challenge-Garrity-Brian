package com.company;

import java.util.Objects;

public class Constable extends Person {

    private String jurisdiction;

    public Constable (String name,  int strength, int health, int stamina, int speed, int attackPower) {
        super(name, 60,100,60,20,5);
    }
    public Constable(){
        super();
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
    public void arrest(Constable constable){
        System.out.println("You have arrested someone!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
