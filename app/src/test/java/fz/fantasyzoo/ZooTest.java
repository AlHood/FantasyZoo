package fz.fantasyzoo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 03/03/2017.
 */

public class ZooTest {

    Zoo testZoo;
    Zoo zoo;
    Dragon dragon;
    Unicorn unicorn;
    ArrayList<Enclosure> enclosureResult;
    int intResult;
    int intResult2;
    Class classResult;
    Enclosure testEnclosure;
    Object objectResult;
    Animal placeholder;
    ArrayList<Integer> buyingArray;
    String zooString;
    Zoo zoo2;
    String animalString;
    Dragon dragon2;
    Troll troll;
    Troll troll2;


    @Before
    public void before() {
        zoo = new Zoo();
        dragon = new Dragon();
        unicorn = new Unicorn();
        testEnclosure = new Enclosure(BiomeType.FOREST);
        troll = new Troll();

    }

    @Test
    public void test_canDoSomeBasics() {
        testZoo = new Zoo();

        testZoo.addAnimalToPopulation(dragon, 0);


        enclosureResult = testZoo.getEnclosures();
        intResult = testZoo.reportEnclosurePopulationTotal(0);


        assertEquals(4, enclosureResult.size());
        assertEquals(1, intResult);


    }

//    @Test
//    public void test_animalBuilder() {
//        try {
//            placeholder = Enclosure.animalBuilder(Dragon.class);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
//        classResult = placeholder.getClass();
//
//        assertEquals( Dragon.class , classResult );
//    }
//
//    @Test
//    public void test_animalBuilderAgain() {
//        try {
//            placeholder = Enclosure.animalBuilder(Unicorn.class);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
//        classResult = placeholder.getClass();
//
//        assertEquals( Unicorn.class , classResult );
//    }

    @Test
    public void test_checkHabitatFailures() throws InstantiationException, IllegalAccessException {
        zoo.addAnimalToPopulation(dragon, 0);
//        in which i add a dragon to the ocean enclosure
        zoo.weeklyHabitatCheck();

        intResult = zoo.reportEnclosurePopulationTotal(0);
        intResult2 = zoo.reportEnclosureImmigrationTotal(0);

        assertEquals(1, intResult);
        assertEquals(1, intResult2);

    }

    @Test
    public void test_checkPredationMatches() throws InstantiationException, IllegalAccessException {
        zoo.addAnimalToPopulation(dragon, 0);
        zoo.addAnimalToPopulation(unicorn, 0);
//        in which i add a dragon and a prey unicorn to the ocean enclosure
        zoo.weeklyPredationCheck();

        intResult = zoo.reportEnclosurePopulationTotal(0);
        intResult2 = zoo.reportEnclosureRemovalTotal(0);

        assertEquals(2, intResult);
        assertEquals(1, intResult2);

    }

    @Test
    public void test_checkEnclosuresHaveBiomes() {
        enclosureResult = zoo.getEnclosures();
        for (Enclosure enclosure : enclosureResult) {
            System.out.println(enclosure.getBiome());
        }
//        manually check output as OCEAN SWAMP FOREST MOUNTAIN
//        recommended to re-run this test at the end of a large one involving all functions
    }


    @Test
    public void test_checkZooBuyingMethod() {
        buyingArray = new ArrayList<Integer>();
        buyingArray.add(0, 1);
        buyingArray.add(1, 0);
        buyingArray.add(2, 0);
        buyingArray.add(3, 0);
        buyingArray.add(4, 0);
        buyingArray.add(5, 0);
        buyingArray.add(6, 0);
        buyingArray.add(7, 0);

        zoo.buyingAnimals(buyingArray, 0);

        enclosureResult = zoo.getEnclosures();
        intResult = zoo.reportEnclosurePopulationTotal(0);

        assertEquals(1, intResult);

    }

    @Test
    public void test_checkZooBuyingMethodThoroughly() {
        buyingArray = new ArrayList<Integer>();
        buyingArray.add(0, 1);
        buyingArray.add(1, 1);
        buyingArray.add(2, 1);
        buyingArray.add(3, 1);
        buyingArray.add(4, 1);
        buyingArray.add(5, 0);
        buyingArray.add(6, 0);
        buyingArray.add(7, 0);
        zoo.buyingAnimals(buyingArray, 0);

        enclosureResult = zoo.getEnclosures();
        intResult = zoo.reportEnclosurePopulationTotal(0);

        assertEquals(5, intResult);

    }


    @Test
    public void test_deserialKiller() {
        zoo.addAnimalToPopulation(dragon, 0);

        GsonBuilder gsonbuilder = new GsonBuilder();
        gsonbuilder.registerTypeAdapter(VileFishman.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Dragon.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Troll.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(GiantEagle.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Selkie.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Ent.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Unicorn.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Ghost.class, new AnimalSerializer());
        gsonbuilder.registerTypeAdapter(Animal.class, new AnimalDeserializer());

        Gson gson = gsonbuilder.create();
        zooString = gson.toJson(zoo);
        animalString = gson.toJson(dragon);

        JsonParser parser = new JsonParser();
        JsonObject obj = parser.parse(animalString).getAsJsonObject();

        troll2 = gson.fromJson(animalString, Troll.class);



//        JsonParser parser = new JsonParser();
//        JsonObject obj = parser.parse(zooString).getAsJsonObject();
    dragon2 = gson.fromJson(obj.get("Dragon"), Dragon.class);
        System.out.println("DRAGON " + dragon2);

        System.out.println(zooString);
        System.out.println(animalString);


//
//        enclosureResult = zoo.getEnclosures();
//        for (Enclosure enclosure : enclosureResult) {
//            System.out.println(enclosure.getBiome());

            zoo2 = gson.fromJson(zooString, Zoo.class);






        }


    }


