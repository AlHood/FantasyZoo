package fz.fantasyzoo;

/**
 * Created by user on 05/03/2017.
 */
import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Troll extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
    int earns;
    String shortName;
    String longName;

    public Troll() {

        this.shortName = "Trl";
        this.longName = "Troll";
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.MOUNTAIN);
        this.habitat.add(BiomeType.SWAMP);
        this.prey = new ArrayList<Class>();
        this.prey.add(VileFishman.class);
        this.prey.add(Unicorn.class);
        this.earns = 10;

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
        return "Troll{" +
                "habitat=" + habitat +
                ", prey=" + prey +
                ", earns=" + earns +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                '}';
    }
}