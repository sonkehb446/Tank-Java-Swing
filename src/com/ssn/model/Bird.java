package com.ssn.model;

import com.ssn.manager.ImageMgr;
import com.ssn.util.Constan;

import java.awt.*;

public class Bird extends  TankObject{
    private boolean isAlive = true;

    public  Bird() {
        x = 12 * Constan.ITEM_SIZE;
        y = 24 * Constan.ITEM_SIZE;
        width = Constan.TANK_SIZE;
        height = Constan.TANK_SIZE;
        image = ImageMgr.arrBirdImages.get(0);
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
        if(!isAlive){
            image =ImageMgr.arrBirdImages.get(1);
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
