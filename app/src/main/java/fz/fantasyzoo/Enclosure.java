package fz.fantasyzoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    ArrayList<Animal> population;
    ArrayList<Animal> removal;
    ArrayList<Animal> immigrants;
    BiomeType biome;
//    Animal tempAnimal;
    ArrayList<Class> predCheck;
    Integer income;
    int p;




    public Enclosure(BiomeType biome) {
        this.population = new ArrayList<Animal>();
        this.removal = new ArrayList<Animal>();
        this.immigrants = new ArrayList<Animal>();
        this.biome = biome;
    }

    public ArrayList<Animal> getPopulation() {
        return population;
    }

    public void addPopulation(Animal animalToAdd) {
        this.population.add(animalToAdd);
    }

    public void addBigPopulation(ArrayList<Animal> animals) {
        this.population.addAll(animals);
    }

    public ArrayList<Animal> getRemoval() {
        return removal;
    }

    public void addRemoval(Animal animalToAdd) {
        this.removal.add(animalToAdd);
    }

    public ArrayList<Animal> getImmigrants() {
        return immigrants;
    }

    public void addImmigrants(Animal animalToAdd) {
        this.immigrants.add(animalToAdd);
    }

    public int reportEnclosurePopulationTotal() {
        return this.population.size();
    }

    //    This method takes in an array of animal classes that a predator would eat and makes a copy into the removal array
    public void checkPredMatches(ArrayList<Class> predMatch) throws InstantiationException, IllegalAccessException {

        for (Animal animal : this.population) {

            if (predMatch.contains(animal.getClass())) {
//                tempAnimal = Enclosure.animalBuilder(animal.getClass());
//                this.removal.add(tempAnimal);
                if(p > 0) {this.removal.add(animal);
                p--;}
            }
        }

    }

    //this method gets the prey animal classes from each animal to be passed into the previous method
    public void checkPredation() throws IllegalAccessException, InstantiationException {
        for (Animal animal : this.population) {
            p = ((this.population.size())/3);
            checkPredMatches(animal.predateCheck());


        }
    }

    public void checkHabitatFailures() throws InstantiationException, IllegalAccessException {
        for (Animal animal : this.population) {
            if ((animal.habitatCheck()).contains(this.biome)) {
//    do nothing
            } else {
//                tempAnimal = Enclosure.animalBuilder(animal.getClass());
//                this.immigrants.add(tempAnimal);
                this.immigrants.add(animal);
            }
        }
    }

    public void animalRemover(Animal animal) {
        this.population.remove(animal);
    }


    //for each animal in the removal array, remove a matching animal from population, then clear removals
    public void animalPredater() {
        for (Animal animal : this.removal) {
            animalRemover(animal);
        }

        this.removal.clear();
    }

    //for each animal in the immigration array, remove a matching animal from population, then send all animals to be added to the clockwise enclosure
    public void animalEvicter(Zoo theZoo) {
        for (Animal animal : this.immigrants) {
            animalRemover(animal);
        }
//        has to be a better way of doing this but this is easier to write right now
        if (this.getBiome() == BiomeType.OCEAN) {
            for (Enclosure enclosure : theZoo.getEnclosures()) {
                if (enclosure.getBiome() == BiomeType.SWAMP) {
                    enclosure.addBigPopulation(this.getImmigrants());
                }
            }
        } else if (this.getBiome() == BiomeType.SWAMP) {
            for (Enclosure enclosure : theZoo.getEnclosures()) {
                if (enclosure.getBiome() == BiomeType.FOREST) {
                    enclosure.addBigPopulation(this.getImmigrants());
                }
            }
        } else if (this.getBiome() == BiomeType.FOREST) {
            for (Enclosure enclosure : theZoo.getEnclosures()) {
                if (enclosure.getBiome() == BiomeType.MOUNTAIN) {
                    enclosure.addBigPopulation(this.getImmigrants());
                }
            }
        } else if (this.getBiome() == BiomeType.MOUNTAIN) {
            for (Enclosure enclosure : theZoo.getEnclosures()) {
                if (enclosure.getBiome() == BiomeType.OCEAN) {
                    enclosure.addBigPopulation(this.getImmigrants());
                }
            }
        }


        this.immigrants.clear();
    }

//    static public Animal animalBuilder(Class animalClass) throws IllegalAccessException, InstantiationException {
////     dangerous and shady. Test.
//        return (Animal) (animalClass.newInstance());
//        Seems safe enough.
//    }

    public BiomeType getBiome() {
        return biome;
    }

    public Integer getIncome() {
        income = 0;
        for (Animal animal : this.population) {
            income += animal.getEarns();
        }
        return income;
    }

    public String enclosureOverviewGen() {
//so i guess this needs to iterate over population to generate a string to put in a textview
      ArrayList<Integer> resultArrayList;
        String reportString;
        reportString = new String();
        resultArrayList = new ArrayList<Integer>();
        resultArrayList = Enclosure.animalArrayToIntegers(this.population);

       reportString = Enclosure.reportArrayToReport(resultArrayList);

        return reportString;
    }

    public String enclosureReportGen(){
//        and similarly this needs to iterate over removals and immigration
        return "";
    }



    public static ArrayList<Integer> animalArrayToIntegers(ArrayList<Animal> animalArray) {
//    my format is going to be troll, VFm, GEagle, selkie, ent, unicorn, dragon, ghost
        ArrayList<Integer> reportArray;


        Integer trollCount;
        Integer vfmCount;
        Integer gEagleCount;
        Integer selkieCount;
        Integer entCount;
        Integer unicornCount;
        Integer dragonCount;
        Integer ghostCount;

        reportArray = new ArrayList<Integer>();

        trollCount = 0;
        vfmCount = 0;
        gEagleCount = 0;
        selkieCount = 0;
        entCount = 0;
        unicornCount = 0;
        dragonCount = 0;
        ghostCount = 0;

        for (Animal animal : animalArray) {
    if (animal.getClass() == Troll.class ) {
        trollCount += 1; }
            if (animal.getClass() == VileFishman.class ) {
                vfmCount += 1; }
            if (animal.getClass() == GiantEagle.class ) {
                gEagleCount += 1; }
            if (animal.getClass() == Selkie.class ) {
                selkieCount += 1; }
            if (animal.getClass() == Ent.class ) {
                entCount += 1; }
            if (animal.getClass() == Unicorn.class ) {
                unicornCount += 1; }
            if (animal.getClass() == Dragon.class ) {
                dragonCount += 1; }
            if (animal.getClass() == Ghost.class ) {
                ghostCount += 1; }

        }

    reportArray.add(0, trollCount);
        reportArray.add(1, vfmCount);
        reportArray.add(2, gEagleCount);
        reportArray.add(3, selkieCount);
        reportArray.add(4, entCount);
        reportArray.add(5, unicornCount);
        reportArray.add(6, dragonCount);
        reportArray.add(7, ghostCount);

    return reportArray;

    }

public static String reportArrayToReport(ArrayList<Integer> reportArray) {
    StringBuilder enclosureReport;
    String enclosureReportString;
    enclosureReport = new StringBuilder();
    enclosureReportString = new String();


    enclosureReport.append("Trolls: " + reportArray.get(0) + "  Vile Fishmen: " + reportArray.get(1) + "    Giant Eagles: " + reportArray.get(2) + "    Selkies: " + reportArray.get(3) + " Ents: " + reportArray.get(4) + "    Unicorns: " + reportArray.get(5) + "    Dragons: " + reportArray.get(6) + " Ghosts: " + reportArray.get(7) );

enclosureReportString = enclosureReport.toString();

    return enclosureReportString;
}






}

