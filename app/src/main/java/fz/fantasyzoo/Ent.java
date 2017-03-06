package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Ent extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
int earns;
    String shortName;
    String longName;



    public Ent() {

        this.shortName = "Et";
        this.longName = "Ents";
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.FOREST);
        this.habitat.add(BiomeType.SWAMP);
        this.prey = new ArrayList<Class>();
        this.prey.add(Troll.class);
        this.earns = 100;
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

    @Override
    public String toString() {
        return "Ent{" +
                "habitat=" + habitat +
                ", prey=" + prey +
                ", earns=" + earns +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                '}';
    }
}
