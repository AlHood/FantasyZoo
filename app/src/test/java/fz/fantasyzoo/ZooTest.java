package fz.fantasyzoo;

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
    ArrayList<Enclosure> enclosureResult;
int intResult;
    int intResult2;
Class classResult;
    Enclosure testEnclosure;
    Object objectResult;
    Animal placeholder;

    @Before
    public void before() {
zoo = new Zoo();
       dragon = new Dragon();
testEnclosure = new Enclosure(BiomeType.FOREST);

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

    @Test
    public void test_animalBuilder() {
        try {
            placeholder = Enclosure.animalBuilder(Dragon.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        classResult = placeholder.getClass();

        assertEquals( Dragon.class , classResult );
    }

    @Test
    public void test_animalBuilderAgain() {
        try {
            placeholder = Enclosure.animalBuilder(Unicorn.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        classResult = placeholder.getClass();

        assertEquals( Unicorn.class , classResult );
    }

    @Test
    public void test_checkHabitatFailures() throws InstantiationException, IllegalAccessException {
        zoo.addAnimalToPopulation(dragon, 0);
//        in which i add a dragon to the ocean enclosure
        zoo.weeklyHabitatCheck();

        intResult = zoo.reportEnclosurePopulationTotal(0);
        intResult2 = zoo.reportEnclosureImmigrationTotal(0);

        assertEquals(1, intResult );
        assertEquals(1, intResult2);

    }


}
