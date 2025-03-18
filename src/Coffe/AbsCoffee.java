package Coffe;

public abstract class AbsCoffee {

    protected String name;
    protected double cost;
    protected String description;
    protected String size;

    public AbsCoffee(String name, double cost, String description, String size) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.size = size;
    }

    abstract String getDescription();
    abstract double getCost();
    abstract String getName();
    abstract String getSize();

}
