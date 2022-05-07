package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * Cappuccino Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Cappuccino extends Coffee {
    /**
     * Constructor for Cappuccino class.
     *
     * @param id The ID of the coffee
     */
    public Cappuccino(int id) {
        super(id, "Cappuccino", CoffeePrices.CAPPUCCINO);
    }

    public String getRecipe() {
        return "1x Espresso, 2x Steamed Milk ve 2x Milk Foam";
    }
}
