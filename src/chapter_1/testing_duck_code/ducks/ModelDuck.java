package chapter_1.testing_duck_code.ducks;

import chapter_1.testing_duck_code.fly.FlyNoWay;
import chapter_1.testing_duck_code.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck.");
    }
}
