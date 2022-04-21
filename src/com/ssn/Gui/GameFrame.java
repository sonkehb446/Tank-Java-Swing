package com.ssn.Gui;


import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {


    private GamePanel gamePanel;



    public GameFrame() {
        setLayout(new CardLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
//        settingPanel = new SettingPanel(this);
//        add(settingPanel);
        setVisible(true);
        gamePanel= new GamePanel();
        add(gamePanel);



    }

//    public void StartGame() {
//
//        settingPanel.setVisible(false);
//        settingPanel.setFocusable(false);
//        gamePanel.setVisible(true);
//        gamePanel.setFocusable(true);
//    }
}
