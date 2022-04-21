package com.ssn.main;

import com.ssn.Gui.GameFrame;
import com.ssn.manager.ImageMgr;
import com.ssn.util.*;
import com.ssn.Gui.*;
public class Main {
    public static void main(String[] args) {

        new ImageMgr();
        new Constan();
        new GamePanel();
        new GameFrame();
    }
}
