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

    public GiantEagle() {
        this.habitat = new ArrayList<BiomeType>();
        this.habitat.add(BiomeType.MOUNTAIN);
        this.habitat.add(BiomeType.OCEAN);
        this.prey = new ArrayList<Class>();
        this.prey.add(Troll.class);
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