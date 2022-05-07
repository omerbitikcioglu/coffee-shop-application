package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * Americano Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Americano extends Coffee {
    /**
     * Constructor for Americano class.
     *
     * @param id The ID of the coffee
     */
    public Americano(int id) {
        super(id, "Americano", CoffeePrices.AMERICANO);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso ve 4x Hot Water";
    }
}
