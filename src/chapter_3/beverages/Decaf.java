package chapter_3.beverages;

import chapter_3.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
