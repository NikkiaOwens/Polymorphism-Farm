package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Collection;

public class Stable {
    private ArrayList<Horse> horses = new ArrayList<Horse>();
    //setup arrayList of horse
    //need 10 horses across 3 stables

    public Stable(){
        horses = new ArrayList<Horse>();
    }


    public Collection<Horse> getHorses() {
        return horses;
    }
}
