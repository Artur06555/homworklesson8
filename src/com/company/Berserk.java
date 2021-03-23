package com.company;

public class Berserk extends Hero {


    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            int num = RPG_Game.random.nextInt(4 ) +1;
            this.setHealth(this.getHealth() + boss.getDamage() / num);
            boss.setHealth(boss.getHealth() - this.getDamage() / num);
            System.out.println("Berserk used superpower!!! " + num);
        }
    }
}
