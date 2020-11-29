package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider, Botanist, Pilot{
    private String name;
    // these methods implemented or make this class abstract
    public Farmer(String name){
        this.name = name;
    }

    public void plant(Crop crop, CropRow row) {

    }

    public void mount(Rideable ride) {
        if(this.name.equals("Froilan") && ride instanceof CropDuster){
            System.out.println("You don't have a pilot's license!");
        }
        else {
            ride.setIsRidden(true);
        }
    }

    public void dismount(Rideable ride) {

    }

    public String makeNoise(){
        return "Good day on the farm.";
    }

    public String eat(Edible food) {
        return null;
    }
}
