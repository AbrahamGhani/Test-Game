package com.pluralsight.models;

public class Player {

    private String name;
    private int hp;
    private int atk;
    private int matk;
    private int mana;


    public Player(String name, int hp, int atk, int matk, int mana) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.matk = matk;
        this.mana = mana;
    }

    public Player() {
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

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void attack(Enemy _enemy){
        int new_hp = _enemy.getHp() - getAtk();
        _enemy.setHp(new_hp);
    }

    public void heal(){
        int new_hp = getHp() + 10;
        setHp(new_hp);
        setMana(getMana()-5);
    }

    public void fireball(Enemy _enemy){
        //make aoe nuke cost 100% of max mana to do high aoe dmg later
        int new_hp = _enemy.getHp() - getMatk() * 10;
        _enemy.setHp(new_hp);

    }


}
