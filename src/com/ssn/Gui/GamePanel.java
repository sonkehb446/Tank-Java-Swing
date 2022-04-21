package com.ssn.Gui;

import com.ssn.manager.ImageMgr;
import com.ssn.util.Constan;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MapPanel mapPanel;
    public GamePanel(){
        setLayout(null);
        setBackground(Color.white);
        intiObjects();

    }

    private void intiObjects() {
        mapPanel = new MapPanel();
        add(mapPanel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(ImageMgr.imageLeft, Constan.PADDING_LEFT, Constan.PADDING_TOP,
                Constan.LEFT_RIGHT_SIZE, Constan.MAP_SIZE,null  );

        g2d.drawImage(ImageMgr.imageRight, Constan.RIGHT_START_X, Constan.PADDING_TOP,
                Constan.LEFT_RIGHT_SIZE, Constan.MAP_SIZE,null  );
        //FIXME UPDATE 3 WITH PLAYER LIVE COUNT
        //TODO :>
        g2d.drawImage(ImageMgr.arrNumImages.get(3), Constan.RIGHT_START_X+125,
                Constan.PADDING_TOP+500,
                30, 30,null  );

        for(int i = 0 ; i < 8 ; i++){
            g2d.drawImage(ImageMgr.imageIconBoss,
                    Constan.RIGHT_START_X+50,
                    Constan.PADDING_TOP + 50 * i + 30,
                    150,30,null);
        }
    }
}
