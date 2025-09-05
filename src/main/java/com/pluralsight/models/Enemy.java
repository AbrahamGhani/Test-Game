package com.pluralsight.models;

public class Enemy {
    private String name;
    private int hp;
    private int atk;
    private int mana;

    public Enemy() {
    }

    public Enemy(String name, int hp, int atk, int mana) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
