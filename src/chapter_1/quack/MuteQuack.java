package chapter_1.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Cricket sound... <Silence>");
    }
}
