package chapter_1;

import chapter_1.quack.Quack;
import chapter_1.quack.QuackBehavior;

public class DuckCall {
    private QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
