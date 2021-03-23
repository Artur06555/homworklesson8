package com.company;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int increase=RPG_Game.random.nextInt(4)+1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 )
            heroes[i].setDamage(heroes[i].getDamage() + increase);
        }
        System.out.println("Magic increased the attack of heroes! +" + increase);
    }
}
