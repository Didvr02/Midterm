package Coffe;
/**
 * Latte class implements the Coffee interface.
 * A concrete class created by the Factory Method.
 */
public class Latte implements Coffee {
    @Override
    public String getDescription() {
        return "Coffe.Coffee.Latte";
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}