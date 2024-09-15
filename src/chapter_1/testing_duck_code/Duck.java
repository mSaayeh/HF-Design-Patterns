package chapter_1.testing_duck_code;

import chapter_1.testing_duck_code.fly.FlyBehavior;
import chapter_1.testing_duck_code.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming... Tsh! Tsh!");
    }
}
