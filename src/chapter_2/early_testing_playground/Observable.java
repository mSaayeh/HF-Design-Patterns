package chapter_2.early_testing_playground;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> observerList = new ArrayList<>();

    void subscribeObserver(Observer observer) {
        observerList.add(observer);
    }

    void unsubscribeObserver(Observer observer) {
        observerList.remove(observer);
    }

    void onDataChange() {
        observerList.forEach(Observer::notifyDataChange);
    }
}
