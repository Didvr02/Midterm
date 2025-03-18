package Coffe;
/**
 * Cappuccino class implements the Coffee interface.
 * A concrete class created by the Factory Method.
 */
public class Cappuccino extends AbsCoffee {

    public Cappuccino(String name, double price, String description, String size) {
        super(name, price, description, size);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

}