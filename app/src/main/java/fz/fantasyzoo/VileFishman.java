package fz.fantasyzoo;

/**
 * Created by user on 05/03/2017.
 */

import java.util.ArrayList;

public class VileFishman extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
    int earns;

    public VileFishman() {
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.OCEAN);
        this.habitat.add(BiomeType.SWAMP);
        this.prey = new ArrayList<Class>();
        this.prey.add(Selkie.class);
        this.prey.add(Dragon.class);
        this.earns = 30;
    }

    public int getEarns() {
        return earns;
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