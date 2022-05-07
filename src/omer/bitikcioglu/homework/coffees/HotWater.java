package omer.bitikcioglu.homework.coffees;

import omer.bitikcioglu.homework.Coffee;
import omer.bitikcioglu.homework.CoffeePrices;

/**
 * HotWater Class
 *
 * Since coffee machine gives it, it is considered
 * as a coffee type in our program.
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class HotWater extends Coffee {
    /**
     * Constructor for HotWater class.
     *
     * @param id The ID of the coffee
     */
    public HotWater(int id) {
        super(id, "HotWater", CoffeePrices.HOT_WATER);
    }

    /**
     * Gets recipe of the coffee.
     *
     * @return Hot water recipe
     */
    @Override
    public String getRecipe() {
        return "5x Hot Water";
    }
}
