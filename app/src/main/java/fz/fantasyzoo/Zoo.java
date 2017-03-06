package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Zoo {


    Integer budget;
    //    double security;
    ArrayList<Enclosure> enclosures;
    Enclosure ocean;
    Enclosure swamp;
    Enclosure forest;
    Enclosure mountain;
    Enclosure tempEnclosure;
    Integer totalIncome;

    Troll troll;
    VileFishman vileFishman;
    GiantEagle giantEagle;
    Selkie selkie;
    Ent ent;
    Unicorn unicorn;
    Dragon dragon;
    Ghost ghost;


    public Zoo() {
        this.enclosures = new ArrayList<Enclosure>();
        this.budget = 250;
//        this.security = 5;
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

    public void buyingAnimals(ArrayList<Integer> activityArray, int enclosureIndex) {
//    taking in an array of integers created from the buying animal activity, adds them to enclosure
        int i;

        i = activityArray.get(0);

while (i > 0) {
    troll = new Troll();
addAnimalToPopulation(troll, enclosureIndex);
    i --; }

        i = activityArray.get(0);
        while (i > 0) {
            vileFishman = new VileFishman();
            addAnimalToPopulation(vileFishman, enclosureIndex);
            i --; }

        i = activityArray.get(0);
        while (i > 0) {
            giantEagle = new GiantEagle();
            addAnimalToPopulation(giantEagle, enclosureIndex);
            i --; }

        i = activityArray.get(0);
        while (i > 0) {
            selkie = new Selkie();
            addAnimalToPopulation(selkie, enclosureIndex);
            i --; }

        i = activityArray.get(0);
        while (i > 0) {
            ent = new Ent();
            addAnimalToPopulation(ent, enclosureIndex);
            i --; }

        i = activityArray.get(0);
        while (i > 0) {
            unicorn = new Unicorn();
            addAnimalToPopulation(unicorn, enclosureIndex);
            i --; }

        i = activityArray.get(0);
        while (i > 0) {
            dragon = new Dragon();
            addAnimalToPopulation(dragon, enclosureIndex);
            i --; }

        i = activityArray.get(0);
        while (i > 0) {
            ghost = new Ghost();
            addAnimalToPopulation(ghost, enclosureIndex);
            i --; }

    }





}
