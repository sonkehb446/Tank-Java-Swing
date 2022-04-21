package com.ssn.model;

import com.ssn.manager.ImageMgr;
import com.ssn.util.Constan;

public class TankPlayer extends Tank {

    public TankPlayer() {
        super();
        liveTank = 3;
        orient = Constan.UP_ORIENT;
        id = Constan.TANK_ID;
        x = 8 * Constan.ITEM_SIZE;
        y = 24 * Constan.ITEM_SIZE;
        image = ImageMgr.arrPlayerImages.get(orient);
    }

    @Override
    public void moveTank() {
        switch (orient) {
            case Constan.UP_ORIENT:
                y -= speed;
                break;
            case Constan.DOWN_ORIENT:
                y += speed;
                break;
            case Constan.LEFT_ORIENT:
                x -= speed;
                break;
            case Constan.RIGH_ORIENT:
                x += speed;
                break;
        }
    }

    @Override
    public void fireBullet() {

    }
}
