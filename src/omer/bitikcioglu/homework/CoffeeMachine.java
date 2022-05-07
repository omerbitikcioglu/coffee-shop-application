package omer.bitikcioglu.homework;

import omer.bitikcioglu.homework.coffees.*;

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

        Coffee c1 = new Espresso(1);
        Coffee c2 = new Doppio(2);
        Coffee c3 = new Cappuccino(3);
        Coffee c4 = new Latte(4);
        Coffee c5 = new Mocha(5);
        Coffee c6 = new Americano(6);
        Coffee c7 = new HotWater(7);

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
     * <p>
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
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getCoffeeId() + ". " + coffee);
        }
    }

    /**
     * Returns the coffee with the given id
     *
     * @param coffeeId The id of the coffee to be returned
     * @return The coffee with the given id
     */
    public Coffee getCoffee(int coffeeId) {
        return coffees.get(coffeeId);
    }
}
