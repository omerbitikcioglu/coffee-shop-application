package omer.bitikcioglu.homework;

import java.util.ArrayList;

/**
 * Coffee Machine Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class CoffeeMachine {

    /**
     * The coffee types the machine can produce.
     */
    private final ArrayList<Coffee> coffees = new ArrayList<>();

    /**
     * Constructor for coffee machine class.
     */
    public CoffeeMachine() {

        Coffee c1 = new Coffee(1,"Espresso", CoffeePrices.ESPRESSO);
        Coffee c2 = new Coffee(2,"Double Espresso", CoffeePrices.DOUBLE_ESPRESSO);
        Coffee c3 = new Coffee(3,"Cappuccino", CoffeePrices.CAPPUCCINO);
        Coffee c4 = new Coffee(4,"Caffe Latte", CoffeePrices.CAFFE_LATTE);
        Coffee c5 = new Coffee(5,"Mocha", CoffeePrices.MOCHA);
        Coffee c6 = new Coffee(6,"Americano", CoffeePrices.AMERICANO);
        Coffee c7 = new Coffee(7,"Hot Water", CoffeePrices.HOT_WATER);

        addCoffee(c1);
        addCoffee(c2);
        addCoffee(c3);
        addCoffee(c4);
        addCoffee(c5);
        addCoffee(c6);
        addCoffee(c7);
    }

    /**
     * Getter for count of coffee types.
     *
     * @return The number of coffee types in the machine
     */
    public int getNumOfCoffees() {
        return coffees.size();
    }

    /**
     * Add coffee type to the machine.
     *
     * If the coffee already exists in the machine,
     * it does not allow it to be added.
     *
     * @param c The coffee type to be added.
     */
    private void addCoffee(Coffee c) {
        if (!(coffees.contains(c))) {
            coffees.add(c);
        }
    }

    /**
     * Show the list of coffee types in the machine.
     */
    public void showCoffees() {
        for (Coffee coffee: coffees) {
            System.out.println(coffee.getCoffeeId() + ". " + coffee);
        }
    }
}
