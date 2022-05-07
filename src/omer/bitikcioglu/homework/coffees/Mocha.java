package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * Mocha Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Mocha extends Coffee {
    /**
     * Constructor for Mocha class.
     *
     * @param id The ID of the coffee
     */
    public Mocha(int id) {
        super(id, "Mocha", CoffeePrices.MOCHA);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso, 1x Steamed Milk, 1x Milk Foam ve 2x Hot Chocolate";
    }
}
