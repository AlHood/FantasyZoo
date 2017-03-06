package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Dragon extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
int earns;
String longName;
    String shortName;



    public Dragon() {
        this.shortName = "Dr";
        this.longName = "Dragons";
this.habitat = new ArrayList<BiomeType>();
  this.habitat.add(BiomeType.FOREST);
  this.habitat.add(BiomeType.MOUNTAIN);
        this.prey = new ArrayList<Class>();
this.prey.add(Unicorn.class);
        this.prey.add(Ent.class);
        this.earns = 1000;

    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
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
        return "Dragon{" +
                "habitat=" + habitat +
                ", prey=" + prey +
                ", earns=" + earns +
                ", longName='" + longName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
