package omer.bitikcioglu.homework;

/**
 * This class represents the coffee types in the machine.
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Coffee {

    /**
     * ID of the coffee
     */
    private final int id;

    /**
     * Name of the coffee
     */
    private final String name;

    /**
     * Price of the coffee
     */
    private final int price;

    /**
     * Constructor for Coffee class.
     *
     * @param id The ID of the coffee
     * @param name Name of the coffee
     * @param price Price of the coffee
     */
    public Coffee(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Getter for coffee id
     *
     * @return ID of the coffee
     */
    public int getCoffeeId() {
        return id;
    }

    /**
     * Getter for coffee name
     *
     * @return Name of the coffee
     */
    public String getCoffeeName() {
        return name;
    }

    /**
     * Compares two coffee objects with respect to their name and prices.
     * If two of them has the same name and price, then it returns true.
     *
     * @param obj The coffee object to be compared
     * @return True if the two coffee object are equal
     */
    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Coffee)) {
            return false;
        }
        Coffee c = (Coffee) obj;
        return this.name.equals(c.name) &&
                this.price == c.price;
    }

    /**
     * Helps to print out coffee object with its id, name and price.
     * For instance: 1. Cappuccino(12TL)
     *
     * @return The string representation of the coffee
     */
    @Override
    public String toString() {
        return id + ". " + name + '(' + price + "₺)";
    }

    /**
     * This method gives the recipe of the coffee.
     * In this generic form, there is no recipe but child classes will have one.
     *
     * @return The recipe of the coffee
     */
    public String getRecipe() {
        return "1x Coffee";
    }
}
