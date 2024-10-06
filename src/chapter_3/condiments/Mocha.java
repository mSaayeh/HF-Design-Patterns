package chapter_3.condiments;

import chapter_3.Beverage;
import chapter_3.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        String beverageDescription = beverage.getDescription();
        if (beverageDescription.contains("Double Mocha")) {
            return beverageDescription.replace("Double Mocha", "Terrible Mocha");
        }
        if (beverageDescription.contains("Mocha")) {
            return beverageDescription.replace("Mocha", "Double Mocha");
        }
        return beverageDescription + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
