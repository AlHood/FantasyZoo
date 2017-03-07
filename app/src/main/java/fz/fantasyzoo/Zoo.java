package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Zoo {


    Integer budget;
    //    double security;
    ArrayList<Enclosure> enclosures;

    Enclosure tempEnclosure;
    Integer totalIncome;
    Integer i;
    Troll troll;
    VileFishman vileFishman;
    GiantEagle giantEagle;
    Selkie selkie;
    Ent ent;
    Unicorn unicorn;
    Dragon dragon;
    Ghost ghost;

static public void setupZoo(Zoo zoo) {
    Enclosure ocean;
    Enclosure swamp;
    Enclosure forest;
    Enclosure mountain;
Troll troll;

    ocean = new Enclosure(BiomeType.OCEAN);
    swamp = new Enclosure(BiomeType.SWAMP);
    forest = new Enclosure(BiomeType.FOREST);
    mountain = new Enclosure(BiomeType.MOUNTAIN);

    zoo.enclosures.add(ocean);
    zoo.enclosures.add(swamp);
    zoo.enclosures.add(forest);
    zoo.enclosures.add(mountain);

//    troll = new Troll();
//    zoo.addAnimalToPopulation(troll, 0);
}

    public Zoo() {
        this.enclosures = new ArrayList<Enclosure>();
        this.budget = 250;
//        this.security = 5;

        Zoo.setupZoo(this);
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }


    public void addAnimalToPopulation(Animal animal, int enclosureIndex) {
//        tempEnclosure = this.enclosures.get(enclosureIndex);
//        tempEnclosure.addPopulation(animal);
//        this.enclosures.set(enclosureIndex, tempEnclosure);
        this.enclosures.get(enclosureIndex).addPopulation(animal);

    }

    public void addAllAnimalsToPopulation(ArrayList<Animal> animals, int enclosureIndex) {
//        tempEnclosure = new Enclosure(BiomeType.FOREST);
//        tempEnclosure = this.enclosures.get(enclosureIndex);
//        tempEnclosure.addBigPopulation(animals);
//        this.enclosures.set(enclosureIndex, tempEnclosure);

        this.enclosures.get(enclosureIndex).addBigPopulation(animals);

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
        Integer i;

        i = activityArray.get(0);

while (i > 0) {
    troll = new Troll();
addAnimalToPopulation(troll, enclosureIndex);
    i--; }

        i = activityArray.get(1);
        while (i > 0) {
            vileFishman = new VileFishman();
            addAnimalToPopulation(vileFishman, enclosureIndex);
            i--; }

        i = activityArray.get(2);
        while (i > 0) {
            giantEagle = new GiantEagle();
            addAnimalToPopulation(giantEagle, enclosureIndex);
            i--; }

        i = activityArray.get(3);
        while (i > 0) {
            selkie = new Selkie();
            addAnimalToPopulation(selkie, enclosureIndex);
            i--; }

        i = activityArray.get(4);
        while (i > 0) {
            ent = new Ent();
            addAnimalToPopulation(ent, enclosureIndex);
            i--; }

        i = activityArray.get(5);
        while (i > 0) {
            unicorn = new Unicorn();
            addAnimalToPopulation(unicorn, enclosureIndex);
            i--; }

        i = activityArray.get(6);
        while (i > 0) {
            dragon = new Dragon();
            addAnimalToPopulation(dragon, enclosureIndex);
            i--; }
        i = activityArray.get(7);
        while (i > 0) {
            ghost = new Ghost();
            addAnimalToPopulation(ghost, enclosureIndex);
            i--; }


    }





}
