package chapter_1.testing_duck_code.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm FLYING!!");
    }
}
