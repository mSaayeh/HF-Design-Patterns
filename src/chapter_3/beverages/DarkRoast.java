package chapter_3.beverages;

import chapter_3.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
