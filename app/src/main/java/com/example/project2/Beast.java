package com.example.project2;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.project2.DB.AppDataBase;

@Entity(tableName = AppDataBase.BEAST_TABLE)
public class Beast {
    @PrimaryKey(autoGenerate = true)
    private int beastId;

    static final String lobo = "lobo";
    static final String mouse = "mouse";

    private String beastName;

    private int health;

    private int defense;

    private int attack;

    public Beast(String beastName, int health, int defense, int attack) {
        this.beastName = beastName;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
    }

    public int getBeastId() {
        return beastId;
    }

    public void setBeastId(int beastId) {
        this.beastId = beastId;
    }

    public String getBeastName() {
        return beastName;
    }

    public void setBeastName(String beastName) {
        this.beastName = beastName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}