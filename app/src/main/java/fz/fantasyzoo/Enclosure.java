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


    public ArrayList<Animal> getPopulation() {
        return population;
    }

    public void addPopulation(Animal animalToAdd) {
        this.population.add = population;
    }

    public ArrayList<Animal> getRemoval() {
        return removal;
    }

    public void addRemoval(Animal animalToAdd) {
        this.removal = removal;
    }

    public ArrayList<Animal> getImmigrants() {
        return immigrants;
    }

    public void addImmigrants(Animal animalToAdd) {
        this.immigrants = immigrants;
    }

    public Enclosure(BiomeType biome) {
        this.population = new ArrayList<Animal>();
        this.removal = new ArrayList<Animal>();
        this.immigrants = new ArrayList<Animal>();
        this.biome = biome;
    }







}
