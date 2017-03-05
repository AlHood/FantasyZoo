package fz.fantasyzoo;

/**
 * Created by user on 05/03/2017.
 */
import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Ghost extends Animal {

    ArrayList<BiomeType> habitat;
    ArrayList<Class> prey;
int earns;

    public Ghost() {
        this.earns = 0;
        this.habitat = new ArrayList<BiomeType>();
        this.prey = new ArrayList<Class>();
        this.prey.add(Dragon.class);
        this.prey.add(Troll.class);
        this.prey.add(VileFishman.class);
        this.prey.add(Ent.class);
        this.prey.add(GiantEagle.class);
        this.prey.add(Selkie.class);
//        this.prey.add(Ghost.class); haha i don't trust this line

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