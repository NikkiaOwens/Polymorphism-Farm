package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Tuesday {

    Farm froilansFarm = new Farm();
    Farmer froilan = new Farmer("Froilan");
    Tractor johnnyDeer = new Tractor();

    @Before
    public void setup() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        froilansFarm.getFarmhouse().getPeople().add(froilan);
        froilansFarm.getGarage().add(johnnyDeer);
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
                    thisRow.get(j).setHasBeenFertilized(true);
                }
        }
    }

    @Test
    public void TuesdayRoutine(){
        //given
        froilan.mount(johnnyDeer);
        boolean tractorOperated = johnnyDeer.getBeingRidden();
        ArrayList<Crop> harvestedCrops = new ArrayList<Crop>();
        //when
        do { //harvest all Tomato
            johnnyDeer.harvest(froilansFarm.getField(), "Tomato", tractorOperated);
        }
        while(johnnyDeer.harvest(froilansFarm.getField(), "Tomato", tractorOperated) != null);

        do { //harvest all Earcorn
            johnnyDeer.harvest(froilansFarm.getField(), "EarCorn", tractorOperated);
        }
        while(johnnyDeer.harvest(froilansFarm.getField(), "EarCorn", tractorOperated) != null);
        //then
        //checks that everything has been harvested (empty CropRows)
        for(CropRow cr: froilansFarm.getField().getRowsOfCrops()){
            Assert.assertTrue(cr.getCrops().size() == 0);
        }
    }
}
