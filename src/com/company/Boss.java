package com.company;

public class Boss extends GameEntity {

    private final int originalDamage;
    {
    }

    public Boss(int health, int damage) {
        super();
        originalDamage = damage;
    }

    public  boolean isStun(){return isStun();}
    public int getOriginalDamage() {
        return originalDamage;
    }

    public Boss(int health, int damage, int originalDamage) {
        super(health, damage);


        this.originalDamage = originalDamage;

    }
}
