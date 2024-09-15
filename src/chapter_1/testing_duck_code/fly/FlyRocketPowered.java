package chapter_1.testing_duck_code.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a ROCKET!!");
    }
}
