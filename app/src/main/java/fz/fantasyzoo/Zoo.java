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
    Integer totalIncome;



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

    public void addAllAnimalsToPopulation(ArrayList<Animal> animals, int enclosureIndex) {
        tempEnclosure = new Enclosure(BiomeType.FOREST);
        tempEnclosure = this.enclosures.get(enclosureIndex);
        tempEnclosure.addBigPopulation(animals);
        this.enclosures.set(enclosureIndex, tempEnclosure);
    }

    public int reportEnclosurePopulationTotal(int enclosureIndex) {
        tempEnclosure = this.enclosures.get(enclosureIndex);
        return tempEnclosure.reportEnclosurePopulationTotal();
    }



    public int reportEnclosureImmigrationTotal(int enclosureIndex) {
        tempEnclosure = this.enclosures.get(enclosureIndex);
        return tempEnclosure.getImmigrants().size();
    }



    public int reportEnclosureRemovalTotal(int enclosureIndex) {
        tempEnclosure = this.enclosures.get(enclosureIndex);
        return tempEnclosure.getRemoval().size();
    }

    public Integer getWeeklyEarnings() {
       totalIncome = 0;
        for (Enclosure enclosure : this.enclosures) {
           totalIncome += enclosure.getIncome();
        }
        return totalIncome;
    }

    public void weeklyPredationCheck() throws InstantiationException, IllegalAccessException {
        for (Enclosure enclosure : this.enclosures) {
            enclosure.checkPredation();
        }
    }

    public void weeklyRemovalPerformance() throws InstantiationException, IllegalAccessException {
        for (Enclosure enclosure : this.enclosures) {
            enclosure.animalPredater();
        }
    }

    public void weeklyHabitatCheck() throws IllegalAccessException, InstantiationException {
        for (Enclosure enclosure : this.enclosures) {
            enclosure.checkHabitatFailures();
        }
    }

    public void weeklyImmigrationPerformance() throws InstantiationException, IllegalAccessException {
        for (Enclosure enclosure : this.enclosures) {
            enclosure.animalEvicter(this);
        }
    }

    public void performWeeklyAdvance() throws IllegalAccessException, InstantiationException {
//        predations, immigrants, budget
        this.weeklyPredationCheck();
        this.weeklyRemovalPerformance();
        this.weeklyHabitatCheck();
        this.weeklyImmigrationPerformance();
        this.budget += this.getWeeklyEarnings();


    }


}
