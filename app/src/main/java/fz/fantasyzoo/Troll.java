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

    public Troll() {
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.MOUNTAIN);
        this.habitat.add(BiomeType.SWAMP);
        this.prey = new ArrayList<Class>();
        this.prey.add(VileFishman.class);
        this.prey.add(Unicorn.class);
        this.earns = 10;

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