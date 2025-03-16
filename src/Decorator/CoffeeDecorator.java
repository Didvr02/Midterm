package Decorator;

import Coffe.Coffee;

/**
 * Abstract CoffeeDecorator class implements the Decorator pattern.
 * Adds functionality to Coffee objects.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    /**
     * Constructor to create a decorator.
     * @param coffee The Coffee object to decorate.
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + getDecoratorDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost() + getDecoratorCost();
    }

    /**
     * Returns the description of the decorator.
     * @return The decorator description.
     */
    protected abstract String getDecoratorDescription();

    /**
     * Returns the cost of the decorator.
     * @return The decorator cost.
     */
    protected abstract double getDecoratorCost();
}