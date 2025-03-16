package Decorator;

import Coffe.Coffee;


/**
 * ChocolateDecorator class adds chocolate to coffee.
 * A concrete decorator.
 */
public class ChocolateDecorator extends CoffeeDecorator {

    /**
     * Constructor to create a chocolate decorator.
     * @param coffee The Coffee object to decorate.
     */
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    protected String getDecoratorDescription() {
        return "Chocolate";
    }

    @Override
    protected double getDecoratorCost() {
        return 1.0;
    }
}