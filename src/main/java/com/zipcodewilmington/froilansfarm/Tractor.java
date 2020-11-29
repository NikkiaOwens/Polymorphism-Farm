package com.zipcodewilmington.froilansfarm;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tractor extends FarmVehicle {
    public Tractor(){

    }

    public Edible harvest(Field field, String cropType){
        if(super.getBeingRidden()) {
            //check if crop exist in the row
            Integer[] coordinate = findLocation(field, cropType);
            Integer[] invalidCoordinate = {null, null};
            //removes crop and returns an edible
            if(Arrays.equals(coordinate, invalidCoordinate)){
                return null;
            }
            else {
                Crop removedCrop = removeCrop(field,coordinate);
                return removedCrop.yield();
            }
        }
        else{
            System.out.println("This is not a Tesla Tractor!");
            return null;
        }
    }

    public Integer[] findLocation(Field field, String cropType){
        Integer[] coordinate = {null, null};
        List<CropRow> myRows = field.getRowsOfCrops();

        for(int i = 0; i <5; i++){
            List<Crop>thisRow = myRows.get(i).getCrops();
            for(int j = 0; j<myRows.get(i).getCrops().size(); j++){
                Crop thisCrop = thisRow.get(j);
                if(getProduceName(thisCrop.getClass().getSimpleName()).equals(cropType) & thisCrop.getHasBeenFertilized() == true){
                    coordinate[0] = i;
                    coordinate[1] = j;
                    return coordinate;
                }
            }
        }
        return coordinate;
    }

    public String getProduceName(String cropParent){
        if(cropParent.equals("CornStalk")){
            return "EarCorn";
        }
        else{
            return "Tomato";
        }
    }

    public Crop removeCrop(Field field, Integer[] coordinate){
        List<CropRow> myRows = field.getRowsOfCrops();
        List<Crop> myRow = myRows.get(coordinate[0]).getCrops();
        Crop removedCrop = myRow.get(coordinate[1]);
        myRow.remove((int)coordinate[1]); //int required for removing by index
        return removedCrop;
    }

    @Override
    public String makeNoise(){
        return "vrrooom";
    }

}
