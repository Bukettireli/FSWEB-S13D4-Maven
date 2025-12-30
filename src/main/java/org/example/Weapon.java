package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    BOW(30, 2.0),
    AXE(70, 1.0),
    DAGGER(25, 2.5);

    private int damage;
    private double attackSpeed;


    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
