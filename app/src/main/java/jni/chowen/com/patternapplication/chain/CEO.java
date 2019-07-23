package activity.main.myapplication.chain;

import java.util.logging.Logger;

/**
 * Copyright (c) 2019.  All rights reserved.
 * Created by zhouwen on 2019/7/20.
 */

public class CEO extends AbstractHandler {
    @Override
    public void onHandlerMessage(int days) {
        if(days <= 60){
            Logger.getLogger("CEO").info("老板可以批准");
        } else {
            Logger.getLogger("CEO").info("可以滚蛋了");
        }
    }
}
