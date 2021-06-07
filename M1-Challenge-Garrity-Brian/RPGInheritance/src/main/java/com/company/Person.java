package com.company;

import java.util.Objects;

public class Person {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Person(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public Person() {
    }

    public void run() {
        System.out.println("I'm running away from battle");
    }

    public void attack() {
        System.out.println("Time to attack!");
    }

    public void heal() {

        System.out.println("Its Healing Time!");
    }

    public void decreaseHealth(Person person) {
        setHealth(person.getHealth() - 1);
        System.out.println("Health has decreased by 1");
    }

    public void increaseStamina(Person person) {
        setStamina(person.getStamina() + 1);
        System.out.println("Health has increased by 1");
    }

    public void decreaseStamina(Person person) {
        setStamina(person.getStamina() - 1);
        System.out.println("Stamina has decreased by 1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return strength == person.strength && health == person.health && stamina == person.stamina && speed == person.speed && attackPower == person.attackPower && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }
}

