package Coffe;
/**
 * Espresso class implements the Coffee interface.
 * A concrete class created by the Factory Method.
 */
public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Coffe.Coffee.Espresso";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}