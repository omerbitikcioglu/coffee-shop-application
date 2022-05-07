package omer.bitikcioglu.homework.tests;

import omer.bitikcioglu.homework.CoffeeMachine;
import omer.bitikcioglu.homework.coffees.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Add some description here.
 *
 * @author Ömer Faruk Bitikçioğlu
 */
class CoffeeMachineTest {

    private static final CoffeeMachine cm = new CoffeeMachine();

    @Test
    void getNumOfCoffees() {

        // Coffee machine has 7 coffee types inside
        assertEquals(7, cm.getNumOfCoffees());
    }

    @Test
    void getCoffee() {
        assertEquals(cm.getCoffee(1), new Espresso(1));
        assertEquals(cm.getCoffee(2), new Doppio(2));
        assertEquals(cm.getCoffee(3), new Cappuccino(3));
        assertEquals(cm.getCoffee(4), new Latte(4));
        assertEquals(cm.getCoffee(5), new Mocha(5));
        assertEquals(cm.getCoffee(6), new Americano(6));
        assertEquals(cm.getCoffee(7), new HotWater(7));
    }
}