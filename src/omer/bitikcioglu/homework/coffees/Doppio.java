package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * Doppio Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Doppio extends Coffee {
    /**
     * Constructor for Doppio class.
     *
     * @param id The ID of the coffee
     */
    public Doppio(int id) {
        super(id, "Double Espresso", CoffeePrices.DOUBLE_ESPRESSO);
    }

    @Override
    public String getRecipe() {
        return "2x Espresso";
    }
}