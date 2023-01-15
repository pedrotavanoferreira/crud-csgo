package com.ptf.crudcsgo.model;

public class Weapon {
    private String name;
    private String color;
    private String ammunition;

    public Weapon(String name, String color, String ammunition) {
        this.name = name;
        this.color = color;
        this.ammunition = ammunition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(String ammunition) {
        this.ammunition = ammunition;
    }
}
