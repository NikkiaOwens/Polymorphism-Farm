package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow <T extends Crop>{
    ArrayList<Crop> crops;

    public CropRow(){
        crops = new ArrayList<Crop>();
    }

    public ArrayList<Crop> getCrops(){
        return crops;
    }
}
