package com.ssn.model;

import com.ssn.manager.ImageMgr;
import com.ssn.util.Constan;

public class MapItem extends TankObject{
    private int type;

    public MapItem(int x ,int y ,int type){
        super(x,y, Constan.ITEM_SIZE,Constan.ITEM_SIZE);
        this.type = type;
        this.image = ImageMgr.arrItemsImages.get(type);

    }
}
