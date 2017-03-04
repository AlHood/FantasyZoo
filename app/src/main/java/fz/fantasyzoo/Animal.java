package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

abstract class Animal {

    public abstract void special();

    public abstract boolean habitatCheck();

    public abstract void predate(ArrayList<Class> enclosurePop);

}
