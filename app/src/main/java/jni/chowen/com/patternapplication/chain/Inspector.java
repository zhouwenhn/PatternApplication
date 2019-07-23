package activity.main.myapplication.chain;

import java.util.logging.Logger;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/20.
 */

public class Inspector extends AbstractHandler {

    public void setNextIns(AbstractHandler abstractHandler) {
        super.setNextIns(abstractHandler);
    }
    @Override
    public void onHandlerMessage(int days) {
        if (days <= 5){
            Logger.getLogger("Inspector").info("总监可以批准");
        } else {
            if (getNextIns() != null) {
                getNextIns().onHandlerMessage(days);
                Logger.getLogger("Inspector").info("总监批准不了,需要上报总经理");
            } else {
                Logger.getLogger("Inspector").info("总监也请假了。。。。");
            }

        }
    }
}
