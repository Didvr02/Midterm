package Coffe;
/**
 * Coffee interface defines the basic methods for all coffee types.
 * Used in the Decorator and Factory Method patterns.
 */
public interface Coffee {
    String getDescription();
    double getCost();
}