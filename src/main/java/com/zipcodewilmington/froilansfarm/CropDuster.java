package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class CropDuster extends FarmVehicle implements Aircraft{

    public CropDuster(){
    }

    public void fertilize(CropRow row){
        if(super.getBeingRidden()) {
            ArrayList<Crop> cropList = row.getCrops();
            for (Crop c : cropList) {
                c.setHasBeenFertilized(true);
            }
        }
    }

    public String fly() {
        return "I believe I can fly!";
    }

    public String makeNoise(){
        return "pewwwww";
    }
}
