package activity.main.myapplication.chain;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/20.
 */

public class Staff {
    public void test(){
        AbstractHandler inspector = new Inspector();
        AbstractHandler manager = new Manager();
        AbstractHandler ceo = new CEO();

        inspector.setNextIns(manager);
        manager.setNextIns(ceo);
        inspector.onHandlerMessage(5);
    }
}
