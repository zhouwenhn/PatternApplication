package activity.main.myapplication.chain;

import java.util.logging.Logger;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/20.
 */

public class Manager extends AbstractHandler {
    @Override
    public void onHandlerMessage(int days) {
        if (days <= 10) {
            Logger.getLogger("Manager").info("总经理可以批准");
        } else {

            if (getNextIns() != null) {
                Logger.getLogger("Manager").info("总经理批准不了,需要上报老板");
                getNextIns().onHandlerMessage(days);
            } else {
                Logger.getLogger("Manager").info("总经理也请假了。。。。");
            }
        }
    }
}
