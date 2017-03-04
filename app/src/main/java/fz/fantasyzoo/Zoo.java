package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Zoo {


    Integer budget;
    double security;
    ArrayList<Enclosure> enclosures;
    Enclosure ocean;
    Enclosure swamp;
    Enclosure forest;
    Enclosure mountain;
Enclosure tempEnclosure;



    public Zoo() {
        this.enclosures = new ArrayList<Enclosure>();
        this.budget = 100;
        this.security = 5;
        ocean = new Enclosure(BiomeType.OCEAN);
        swamp = new Enclosure(BiomeType.SWAMP);
        forest = new Enclosure(BiomeType.FOREST);
        mountain = new Enclosure(BiomeType.MOUNTAIN);
        this.enclosures.add(ocean);
        this.enclosures.add(swamp);
        this.enclosures.add(forest);
        this.enclosures.add(mountain);
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }


    public void addAnimalToPopulation(Animal animal, int enclosureIndex) {
    tempEnclosure = this.enclosures.get(enclosureIndex);
        tempEnclosure.addPopulation(animal);
        this.enclosures.set(enclosureIndex, tempEnclosure);
    }

    public int reportEnclosurePopulationTotal(int enclosureIndex) {
        tempEnclosure = this.enclosures.get(enclosureIndex);
        return tempEnclosure.reportEnclosurePopulationTotal();
    }

    public void weeklyHabitatCheck() throws IllegalAccessException, InstantiationException {
        for (Enclosure enclosure : this.enclosures) {
            enclosure.checkHabitatFailures();
        }
    }

    public int reportEnclosureImmigrationTotal(int enclosureIndex) {
        tempEnclosure = this.enclosures.get(enclosureIndex);
        return tempEnclosure.getImmigrants().size();
    }

    public void weeklyPredationCheck() {
        for (Enclosure enclosure : this.enclosures) {
            enclosure.checkPredationFailures();
        }
    }



}
