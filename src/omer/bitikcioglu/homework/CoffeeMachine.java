package omer.bitikcioglu.homework;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Coffee Machine Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class CoffeeMachine {

    /**
     * The coffees that machine can produce
     */
    private final ArrayList<Coffee> coffees = new ArrayList<>();

    public CoffeeMachine() {

        Coffee c1 = new Coffee(1,"Espresso", CoffeePrices.ESPRESSO);
        Coffee c2 = new Coffee(2,"Double Espresso", CoffeePrices.DOUBLE_ESPRESSO);
        Coffee c3 = new Coffee(3,"Cappuccino", CoffeePrices.CAPPUCCINO);
        Coffee c4 = new Coffee(4,"Caffe Latte", CoffeePrices.CAFFE_LATTE);
        Coffee c5 = new Coffee(5,"Mocha", CoffeePrices.MOCHA);
        Coffee c6 = new Coffee(6,"Americano", CoffeePrices.AMERICANO);
        Coffee c7 = new Coffee(7,"Hot Water", CoffeePrices.HOT_WATER);

        coffees.add(c1);
        coffees.add(c2);
        coffees.add(c3);
        coffees.add(c4);
        coffees.add(c5);
        coffees.add(c6);
        coffees.add(c7);
    }

    public void showCoffees() {
        for (Coffee coffee: coffees) {
            System.out.println(coffee);
        }
    }
}
