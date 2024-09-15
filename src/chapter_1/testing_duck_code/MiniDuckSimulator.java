package chapter_1.testing_duck_code;

import chapter_1.testing_duck_code.ducks.Duck;
import chapter_1.testing_duck_code.ducks.MallardDuck;
import chapter_1.testing_duck_code.ducks.ModelDuck;
import chapter_1.testing_duck_code.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
