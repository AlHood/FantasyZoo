package fz.fantasyzoo;

/**
 * Created by user on 05/03/2017.
 */
import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class GiantEagle extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
    int earns;
    String shortName;
    String longName;


    public GiantEagle() {
            this.shortName = "GEg";
            this.longName = "Giant Eagles";
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.MOUNTAIN);
        this.habitat.add(BiomeType.OCEAN);
        this.prey = new ArrayList<Class>();
        this.prey.add(Troll.class);
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

    @Override
    public String toString() {
        return "GiantEagle{" +
                "habitat=" + habitat +
                ", prey=" + prey +
                ", earns=" + earns +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                '}';
    }
}