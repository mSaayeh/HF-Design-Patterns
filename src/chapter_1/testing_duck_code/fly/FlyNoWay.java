package chapter_1.testing_duck_code.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly :'(");
    }
}
