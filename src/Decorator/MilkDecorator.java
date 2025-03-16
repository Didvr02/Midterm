package Decorator;

import Coffe.Coffee;

/**
 * MilkDecorator class adds milk to coffee.
 * A concrete decorator.
 */
public class MilkDecorator extends CoffeeDecorator {

    /**
     * Constructor to create a milk decorator.
     * @param coffee The Coffee object to decorate.
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    protected String getDecoratorDescription() {
        return "Milk";
    }

    @Override
    protected double getDecoratorCost() {
        return 0.5;
    }
}