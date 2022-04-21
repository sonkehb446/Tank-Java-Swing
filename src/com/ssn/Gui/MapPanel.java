package com.ssn.Gui;

import com.ssn.manager.MapManager;
import com.ssn.model.Bird;
import com.ssn.model.TankPlayer;
import com.ssn.util.Constan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MapPanel extends JPanel {
    private int level =1;
    private MapManager mapManager;
    private TankPlayer tankPlayer;
    private Bird bird;


    public MapPanel(){
        setBackground(Color.black);
        setLayout(null);
        setSize(Constan.MAP_SIZE,Constan.MAP_SIZE);
        setLocation((Constan.WIDTH_FRAME-Constan.MAP_SIZE)/2,Constan.PADDING_TOP);
        setFocusable(true);
        addKeyListener(keyAdapter);
        intiOject();
    }

    private void intiOject() {
        mapManager = new MapManager(level);
        tankPlayer = new TankPlayer();
        bird = new Bird();
    }

    KeyAdapter keyAdapter = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            if(e.getKeyCode() == KeyEvent.VK_UP){
                tankPlayer.setOrient(Constan.UP_ORIENT);
                tankPlayer.moveTank();
            }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                tankPlayer.setOrient(Constan.DOWN_ORIENT);
                tankPlayer.moveTank();
            }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                tankPlayer.setOrient(Constan.LEFT_ORIENT);
                tankPlayer.moveTank();
            }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                tankPlayer.setOrient(Constan.RIGH_ORIENT);
                tankPlayer.moveTank();
            }
            repaint();
        }
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d  = (Graphics2D) g;
        tankPlayer.draw(g2d);
        mapManager.drawAllMapItem(g2d);
        bird.draw(g2d);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
