package Coffe;
/**
 * Cappuccino class implements the Coffee interface.
 * A concrete class created by the Factory Method.
 */
public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Coffe.Coffee.Cappuccino";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}