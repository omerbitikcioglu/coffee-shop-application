package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * Espresso Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Espresso extends Coffee {
    /**
     * Constructor for Espresso class.
     *
     * @param id The ID of the coffee
     */
    public Espresso(int id) {
        super(id, "Espresso", CoffeePrices.ESPRESSO);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso";
    }
}
