package fz.fantasyzoo;

/**
 * Created by user on 05/03/2017.
 */
import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Selkie extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
    int earns;
    String shortName;
    String longName;

    public Selkie() {

        this.shortName = "Slk";
        this.longName = "Selkie";
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.OCEAN);
        this.habitat.add(BiomeType.FOREST);
        this.prey = new ArrayList<Class>();
        this.prey.add(VileFishman.class);
        this.earns = 40;

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
        return "Selkie{" +
                "habitat=" + habitat +
                ", prey=" + prey +
                ", earns=" + earns +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                '}';
    }
}