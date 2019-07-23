package activity.main.myapplication.chain;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/20.
 */

public abstract class AbstractHandler {

    private AbstractHandler mAbstractHandler;

    public void setNextIns(AbstractHandler abstractHandler) {
        mAbstractHandler = abstractHandler;
    }

    public AbstractHandler getNextIns() {
        return mAbstractHandler;
    }


    public abstract void onHandlerMessage(int days);
}
