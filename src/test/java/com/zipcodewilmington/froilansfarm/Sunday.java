package com.zipcodewilmington.froilansfarm;

import org.junit.Before;

public class Monday {

    @Before
    public void setup(){
        Farm froilansFarm = new Farm();
        froilansFarm.field.getRowsOfCrops().add(new CropRow<CornStalk>());
        

    }


}
