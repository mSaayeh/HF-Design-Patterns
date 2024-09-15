package chapter_1.ducks;

import chapter_1.fly.FlyNoWay;
import chapter_1.quack.Quack;

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
