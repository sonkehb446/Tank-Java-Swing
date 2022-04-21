package com.ssn.model;

import com.ssn.manager.ImageMgr;
import com.ssn.util.Constan;

public class TankBoss extends Tank {
    private int level;
    public TankBoss(int level) {
        super();
        liveTank = 3;
        this.level = level;
        orient = Constan.UP_ORIENT;
        id = Constan.TANK_ID;
        x = 8 * Constan.ITEM_SIZE;
        y = 24 * Constan.ITEM_SIZE;
        updateImage();
    }

    private void updateImage() {
        if(level ==1 ){
            image = ImageMgr.arrBoss1Images.get(orient);
        } else if(level ==2 ){
            if(liveTank ==1){
                image = ImageMgr.arrBoss21Images.get(orient);
            }else{
                image = ImageMgr.arrBoss22Images.get(orient);
            }

        } else {
            if (level == 2) {
                if (liveTank == 1) {
                    image = ImageMgr.arrBoss31Images.get(orient);
                } else if (liveTank == 2) {
                    image = ImageMgr.arrBoss32Images.get(orient);
                } else {
                    image = ImageMgr.arrBoss33Images.get(orient);
                }
            }
        }
    }

    @Override
    public void moveTank() {

    }

    @Override
    public void fireBullet() {

    }
}
