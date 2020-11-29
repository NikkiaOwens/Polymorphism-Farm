package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft{
    public CropDuster(){

    }


//    public CropRow<Crop> fertilize(CropRow row){
//        //sets the all Crops in the Row flag "hasBeenFertilizer" boolean to true
//        //returns list or array of crops that has been fertilized
//    }

    public String fly() {
        return "This vehicle can fly, what is the point of this useless interface...";
    }
}
