package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private ArrayList<CropRow> rowsOfCrops = new ArrayList<CropRow>();

    public int getSize(){
        int size = 0;

        for (CropRow cr : rowsOfCrops){
            ArrayList<Crop> crops = cr.getCrops();
            for (Crop c : crops){
                size++;
            }
        }
        return size;
    }

    public ArrayList<CropRow> getRowsOfCrops(){
        return rowsOfCrops;
    }
}
