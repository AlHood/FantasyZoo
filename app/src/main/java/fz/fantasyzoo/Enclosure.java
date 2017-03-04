package fz.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    ArrayList<Animal> population;
    ArrayList<Animal> removal;
    ArrayList<Animal> immigrants;
    BiomeType biome;
    Animal tempAnimal;
    ArrayList<Class> predCheck;

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
        for (Animal animal : this.population ) {
            if (predMatch.contains(animal.getClass() )) {
                tempAnimal = Enclosure.animalBuilder(animal.getClass());
                this.removal.add(tempAnimal);
            }
        }

    }

//this method gets the prey animal classes from each animal to be passed into the previous method
    public void checkPredation() throws IllegalAccessException, InstantiationException {
        for (Animal animal : this.population) {
            checkPredMatches(animal.predateCheck());



        }
    }

    public void checkHabitatFailures() throws InstantiationException, IllegalAccessException {
        for (Animal animal : this.population) {
            if ((animal.habitatCheck()).contains(this.biome)) {
//    do nothing
            } else {
                tempAnimal = Enclosure.animalBuilder(animal.getClass());
                this.immigrants.add(tempAnimal);
            }
        }}


//for each animal in the removal array, remove a matching animal from population
    public void animalPredater() {
    }

//for each animal in the immigration array, remove a matching animal from population, then send an animal to be added to the clockwise enclosure
    public void animalEvicter() {
    }

    static public Animal animalBuilder(Class animalClass) throws IllegalAccessException, InstantiationException {
//     dangerous and shady. Test.
        return (Animal) (animalClass.newInstance());
    }


}








