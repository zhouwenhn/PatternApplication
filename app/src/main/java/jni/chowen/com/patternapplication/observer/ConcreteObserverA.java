package activity.main.myapplication.observer;

import java.util.logging.Logger;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/22.
 */

public class ConcreteObserverA implements Observer{
    @Override
    public void update() {
        Logger.getLogger("ConcreteObserverA").info("update");
    }
}
