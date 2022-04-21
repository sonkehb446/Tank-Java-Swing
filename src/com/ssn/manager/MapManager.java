package com.ssn.manager;

import com.ssn.model.MapItem;
import com.ssn.util.Constan;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MapManager {
    private List<MapItem> mapItems;

    public MapManager(int level) {
        mapItems = new ArrayList<>();

        initMapTiems(level);
    }

    private void initMapTiems(int level) {
        mapItems.clear();
        String path = "src/MAPS/map" + level;

        File file = new File(path);
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)));

            String line = br.readLine();
            int row = 0;
            while(line != null ){
                for(int col = 0 ; col < line.length() ; col++){
                        int type = Integer.parseInt(line.charAt(col)+"");
                        mapItems.add(new MapItem(col* Constan.ITEM_SIZE,row*Constan.ITEM_SIZE,type));
                }
                line = br.readLine();
                row++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void drawAllMapItem(Graphics2D g2d){
        for (int i = 0 ; i < mapItems.size() ; i++){
//                mapItems.get(i).draw(g2d);
        }
    }

    public MapManager(List<MapItem> mapItems) {
        this.mapItems = mapItems;
    }

    public List<MapItem> getMapItems() {
        return mapItems;
    }

    public void setMapItems(List<MapItem> mapItems) {
        this.mapItems = mapItems;
    }
}
