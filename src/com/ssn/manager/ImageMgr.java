package com.ssn.manager;

    import com.ssn.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class ImageMgr {
    public static ArrayList<Image> arrItemsImages;
    public static ArrayList<Image> arrPlayerImages;
    public static ArrayList<Image> arrBoss1Images;
    public static ArrayList<Image> arrBoss21Images;
    public static ArrayList<Image> arrBoss22Images;
    public static ArrayList<Image> arrBoss31Images;
    public static ArrayList<Image> arrBoss32Images;
    public static ArrayList<Image> arrBoss33Images;
    public static ArrayList<Image> arrBulletImages;
    public static ArrayList<Image> arrGiftImages;
    public static ArrayList<Image> arrBumImages;
    public static ArrayList<Image> arrNumImages;
    public static ArrayList<Image> arrBirdImages;
    public static Image imageStart;
    public static Image imageIconBoss;
    public static Image imageLeft;
    public static Image imageRight;

    public ImageMgr() {
        arrItemsImages = getImage("unit", Constan.ITEM_SIZE, Constan.ITEM_SIZE, 6);
        arrPlayerImages = getImage("player", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBoss1Images = getImage("boss1", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBoss21Images = getImage("boss2", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBoss22Images = getImage("boss22", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBoss31Images = getImage("boss31", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBoss32Images = getImage("boss32", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBoss33Images = getImage("boss33", Constan.TANK_SIZE, Constan.TANK_SIZE, 4);
        arrBulletImages = getImage("bullet", Constan.BULLET_SIZE, Constan.BULLET_SIZE, 4);
        arrBumImages = getImage("bum", Constan.TANK_SIZE*2, Constan.TANK_SIZE*2, 9);
        arrGiftImages = getImage("gift", Constan.TANK_SIZE, Constan.TANK_SIZE, 2);
        arrNumImages = getImage("num_level", 16, 16, 10);
        arrBirdImages = getImage("bird", Constan.TANK_SIZE, Constan.TANK_SIZE, 2);
        imageStart = (new ImageIcon(this.getClass().getResource("/IMAGES/game_start.png"))).getImage();
        imageIconBoss = (new ImageIcon(this.getClass().getResource("/IMAGES/icon_boss.png"))).getImage();
        imageLeft = (new ImageIcon(this.getClass().getResource("/IMAGES/left.png"))).getImage();
        imageRight = (new ImageIcon(this.getClass().getResource("/IMAGES/right.png"))).getImage();
    }

    private ArrayList<Image> getImage(String name, int width, int height, int count) {
        ArrayList<Image> result = new ArrayList<>();
        try{
            BufferedImage bufferedImage = ImageIO.read(getClass().getResourceAsStream
                    ("/IMAGES/"+name+".png"));

            for (int i = 0 ; i < count ; i++){
                BufferedImage subImgae = bufferedImage.getSubimage(0,i*height,width,height);
                result.add(subImgae);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


}
