package chapter_1.testing_duck_code.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Cricket sound... <Silence>");
    }
}
