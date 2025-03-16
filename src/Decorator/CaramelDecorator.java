package Decorator;

import Coffe.Coffee;


/**
 * CaramelDecorator class adds caramel to coffee.
 * A concrete decorator.
 */
public class CaramelDecorator extends CoffeeDecorator {
    /**
     * Constructor to create a caramel decorator.
     * @param coffee The Coffee object to decorate.
     */
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    protected String getDecoratorDescription() {
        return "Caramel";
    }

    @Override
    protected double getDecoratorCost() {
        return 0.7;
    }
}