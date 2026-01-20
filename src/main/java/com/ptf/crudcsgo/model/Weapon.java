package com.ptf.crudcsgo.model;

public class Weapon {
    private int id;
    private String name;
    private String type;
    private String skin;

    public Weapon(int id, String name, String type, String skin) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.skin = skin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
}
