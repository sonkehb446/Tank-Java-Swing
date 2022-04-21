package com.ssn.model;

import com.ssn.manager.ImageMgr;
import com.ssn.util.Constan;

public abstract class Tank extends TankObject{
    protected int id;
    protected int orient;
    protected int speed = Constan.STANDARD_SPEED;
    protected int liveTank;

    public abstract void moveTank();
    public abstract void fireBullet();

    public Tank(){
        width =Constan.TANK_SIZE;
        height = Constan.TANK_SIZE;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrient() {
        return orient;
    }

    public void setOrient(int orient) {
        this.orient = orient;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLiveTank() {
        return liveTank;
    }

    public void setLiveTank(int liveTank) {
        this.liveTank = liveTank;
    }
}
