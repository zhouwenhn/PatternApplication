package jni.chowen.com.patternapplication.strategy_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/13 17:17
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void doing() {
        Logger.getLogger("ConcreteStrategyB").info("B doing");
    }
}
