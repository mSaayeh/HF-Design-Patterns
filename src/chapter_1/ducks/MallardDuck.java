package chapter_1.ducks;

import chapter_1.fly.FlyWithWings;
import chapter_1.quack.Quack;

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
