package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * Latte Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Latte extends Coffee {
    /**
     * Constructor for Latte class.
     *
     * @param id The ID of the coffee
     */
    public Latte(int id) {
        super(id, "Caffe Latte", CoffeePrices.CAFFE_LATTE);
    }

    public String getRecipe() {
        return "1x Espresso, 3x Steamed Milk ve 1x Milk Foam";
    }
}
