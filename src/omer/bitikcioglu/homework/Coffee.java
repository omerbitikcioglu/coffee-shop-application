package omer.bitikcioglu.homework;

/**
 * Coffee Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Coffee {

    /**
     * ID of the coffee
     */
    private int id;

    /**
     * Name of the coffee
     */
    private final String name;

    /**
     * Price of the coffee
     */
    private int price;

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
     * Compares two coffee objects.
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
        return this.id == c.id &&
                this.name.equals(c.name) &&
                this.price == c.price;
    }

    /**
     * Helps to print out coffee object with its name and price
     *
     * @return The string representation of the coffee
     */
    @Override
    public String toString() {
        return name + '(' + price + "₺)";
    }
}
