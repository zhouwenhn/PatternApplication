package activity.main.myapplication.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/22.
 */

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unRegister(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void notifyObserver(Observer observer) {
        for (Observer o :
                observers) {
            o.notify();
        }

    }
}
