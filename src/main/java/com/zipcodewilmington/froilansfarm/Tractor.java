package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends FarmVehicle {
    public Tractor(){

    }

    public Edible harvest(Field field, Crop crop){
        //check if crop exist in the row
        Integer[] coordinate = findLocation(field,crop);
        //removes a crop from the row and sets the "hasBeenHarvested" flag on the crop
        removeCrop(coordinate).setHasBeenHarvested(true);
        //returns an edible
        if(crop == CornStalk){
            return new EarCorn();
        }
        else{
            return new Tomato();
        }
    }

    public Integer[] findLocation(Field field, Crop crop){
        Integer[] coordinate = new Integer[2];
        List<CropRow> myRows = field.getCropRows;
        Integer fieldSize = field.getSize;
        Integer cropRowSize = cropRow.getSize;

        for(int i = 0; i <fieldSize; i++){
            for(int j = 0; j<cropRowSize; j++){
                if(myRows.get(i).get(j) == crop & crop.getHasBeenFertilized() == true){
                    coordinate[0] = i;
                    coordinate[1] = j;
                    break;
                }
            }
        }
        return coordinate;
    }

    public Crop removeCrop(Integer[] coordinate){
        List<CropRow> myRows = field.getCropRows;
        List<Crop> myRow = myRows.get(coordinate[0].getRow);
        Crop removedCrop = myRow.get(coordinate[1]);
        myRow.remove(coordinate[1]);
        return removedCrop;
    }
}
