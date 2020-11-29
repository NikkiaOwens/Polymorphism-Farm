package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Monday {

    Farm froilansFarm = new Farm();
    Farmer froilanda = new Farmer("Froilanda");
    CropDuster poom = new CropDuster();

    @Before
    public void setup() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        froilansFarm.getFarmhouse().getPeople().add(froilanda);
        froilansFarm.getGarage().add(poom);
        String[] cropList = {"CornStalk", "TomatoPlant"};
        Class cls;
        String path = "com.zipcodewilmington.froilansfarm.";

        //fill field
        ArrayList<CropRow> cropRows = froilansFarm.getField().getRowsOfCrops();
        for (int i = 0; i < 5; i++) {
            cropRows.add(new CropRow());
            List<Crop> thisRow = cropRows.get(i).getCrops();
            for(int j = 0; j<5; j++){
                if(i == 0) {
                    thisRow.add(j, new CornStalk());
                }
                else if(i == 1){
                    thisRow.add(j, new TomatoPlant());
                }
                else{
                    String genCropName = cropList[(int)(Math.random()*cropList.length)];
                    cls = Class.forName(path+genCropName);
                    Object obj = cls.newInstance();
                    Crop randomCrop = (Crop) obj;
                    thisRow.add(j, randomCrop);
                }
                thisRow.get(j).setHasBeenFertilized(false);
            }
        }
    }

    @Test
    public void MondayRoutine(){
        //given
        froilanda.mount(poom);
        boolean tractorOperated = poom.getBeingRidden();
        //when
        for(CropRow cr: froilansFarm.getField().getRowsOfCrops()){
            poom.fertilize(cr);
        }
        //checks that everything has been harvested (empty CropRows)
        for(CropRow cr: froilansFarm.getField().getRowsOfCrops()){
            ArrayList<Crop> cropList = cr.getCrops();
            for(Crop c: cropList){
                Assert.assertTrue(c.hasBeenFertilized);
            }
        }
    }

}
