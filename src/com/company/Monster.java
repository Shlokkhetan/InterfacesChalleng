package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String Name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Monster(String name, int hitPoints, int strength) {
        Name = name;
        this.hitPoints = hitPoints;
        strength = strength;
        weapon = "Axe";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "Name='" + Name + '\'' +
                ", HitPoints=" + hitPoints +
                ", Strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
    //    @Override
//    public String toString() {
//        return "{Monster name : " + Name + " HitPoints : " + HitPoints + " Strength : " + Strength +  " weapon: " + weapon + "}";
//    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,Name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3,weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            Name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
            weapon = savedValues.get(3);
        }

    }
}
