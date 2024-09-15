package chapter_1;

import chapter_1.ducks.Duck;
import chapter_1.ducks.MallardDuck;
import chapter_1.ducks.ModelDuck;
import chapter_1.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCall duckCall = new DuckCall();
        duckCall.performQuack();
    }
}
