package omer.bitikcioglu.homework.tests;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.coffees.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for Coffee class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
class CoffeeTest {

    @Test
    void testEquals() {

        // Same coffees
        assertEquals(new Coffee(5, "c1", 15), new Coffee(5, "c1", 15));

        // Same coffees with the different id's
        assertEquals(new Coffee(3, "c1", 15), new Coffee(5, "c1", 15));

        // Completely different coffees
        assertNotEquals(new Coffee(4, "c2", 20), new Coffee(5, "c1", 15));

        // Different coffees with the same id
        assertNotEquals(new Coffee(4, "c2", 20), new Coffee(4, "c1", 15));

        // Different coffees with the same name
        assertNotEquals(new Coffee(4, "c1", 25), new Coffee(7, "c1", 20));

        // Different coffees with the same price
        assertNotEquals(new Coffee(6, "c2", 20), new Coffee(4, "c1", 20));

        // Different coffees with the same id's
        assertNotEquals(new Coffee(1, "c1", 12), new Coffee(1, "c2", 15));

        // Different coffees with the same id and prices
        assertNotEquals(new Coffee(2, "c1", 15), new Coffee(2, "c2", 15));
    }

    private final Coffee c0 = new Coffee(1,"coffee", 15);
    private final Coffee c1 = new Espresso(1);
    private final Coffee c2 = new Doppio(2);
    private final Coffee c3 = new Cappuccino(3);
    private final Coffee c4 = new Latte(4);
    private final Coffee c5 = new Mocha(5);
    private final Coffee c6 = new Americano(6);
    private final Coffee c7 = new HotWater(7);

    @Test
    void testRecipes() {
        assertEquals("1x Coffee", c0.getRecipe()); // Generic coffee
        assertEquals("1x Espresso", c1.getRecipe()); // Espresso
        assertEquals("2x Espresso", c2.getRecipe()); // Doppio
        assertEquals("1x Espresso, 2x Steamed Milk ve 2x Milk Foam", c3.getRecipe()); // Cappuccino
        assertEquals("1x Espresso, 3x Steamed Milk ve 1x Milk Foam", c4.getRecipe()); // Latte
        assertEquals("1x Espresso, 1x Steamed Milk, 1x Milk Foam ve 2x Hot Chocolate", c5.getRecipe()); // Mocha
        assertEquals("1x Espresso ve 4x Hot Water", c6.getRecipe()); // Americano
        assertEquals("5x Hot Water", c7.getRecipe()); // HotWater
    }
}