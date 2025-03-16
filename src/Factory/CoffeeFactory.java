package Factory;

import Coffe.Cappuccino;
import Coffe.Coffee;
import Coffe.Espresso;
import Coffe.Latte;

/**
 * CoffeeFactory class implements the Factory Method pattern.
 * Creates Coffee objects based on type.
 */
public class CoffeeFactory {

    /**
     * Creates a Coffee object of the specified type.
     * @param type The coffee type (espresso, cappuccino, latte).
     * @return The Coffee object.
     */
    public Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            default:
                return null;
        }
    }
}