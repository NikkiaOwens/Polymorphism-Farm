package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow<T extends Crop> {
    ArrayList<T> crops;

    public ArrayList<T> getCrops(){
        return crops;
    }
}
