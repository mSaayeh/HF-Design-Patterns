package chapter_1.testing_duck_code.ducks;

import chapter_1.testing_duck_code.fly.FlyWithWings;
import chapter_1.testing_duck_code.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
}
