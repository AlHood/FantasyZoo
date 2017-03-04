package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Dragon extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;

    {

    }

    public Dragon() {
this.habitat = new ArrayList<BiomeType>();
  this.habitat.add(BiomeType.FOREST);
  this.habitat.add(BiomeType.MOUNTAIN);
        this.prey = new ArrayList<Class>();
this.prey.add(Unicorn.class);

    }


    public void special() {

    }

    public boolean habitatCheck() {
        return true;
    }


    public void predate(ArrayList<Class> enclosurePop) {

    }









}
