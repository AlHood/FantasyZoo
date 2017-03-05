package fz.fantasyzoo;

/**
 * Created by user on 05/03/2017.
 */

import java.util.ArrayList;

public class VileFishman extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
    int earns;
    String shortName;
    String longName;

    public VileFishman() {
        this.shortName = "VFm";
        this.longName = "Vile Fishmen";
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.OCEAN);
        this.habitat.add(BiomeType.SWAMP);
        this.prey = new ArrayList<Class>();
        this.prey.add(Selkie.class);
        this.prey.add(Dragon.class);
        this.earns = 30;
    }

    public String getLongName() {
        return longName;
    }

    public String getShortName() {
        return shortName;
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