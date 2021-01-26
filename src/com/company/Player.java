package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Player implements ISaveable {

    private String  name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitPoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitPoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitPoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "{Player: " + name + "/ HitPoits: " + hitPoints + "/ Strength: " + strength + "/ weapon:" + weapon + "}"                ;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3,weapon);



        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

        }
    }





}
