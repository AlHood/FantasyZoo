package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Unicorn extends Animal {


    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;

    public Unicorn() {
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.FOREST);
        this.habitat.add(BiomeType.MOUNTAIN);
        this.prey = new ArrayList<Class>();
//        this.prey.add();
    }


    public void special() {

    }

    public ArrayList<BiomeType> habitatCheck() {
    return this.habitat;
    }


    public ArrayList<Class> predateCheck() {
        return this.prey;
    }
}
