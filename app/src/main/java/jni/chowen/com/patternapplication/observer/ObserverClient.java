package activity.main.myapplication.observer;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/22.
 */

public class ObserverClient {
    public void test() {
        Subject subject = new Subject();

        Observer observera = new ConcreteObserverA();
        subject.register(observera);
        Observer observerb = new ConcreteObserverB();
        subject.register(observerb);

        subject.notifyObserver(observerb);
    }
}
