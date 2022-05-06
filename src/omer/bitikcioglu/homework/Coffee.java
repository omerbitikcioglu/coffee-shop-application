package omer.bitikcioglu.homework;

/**
 * Coffee Class
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public class Coffee {

    private int id;
    private String name;
    private int price;

    public Coffee(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

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

    @Override
    public String toString() {
        return id + ". " + name + '(' + price + "₺)";
    }
}
