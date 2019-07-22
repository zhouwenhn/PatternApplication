package jni.chowen.com.patternapplication.strategy_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/13 17:16
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void doing() {
        Logger.getLogger("ConcreteStrategyA").info("A doing");
    }
}
