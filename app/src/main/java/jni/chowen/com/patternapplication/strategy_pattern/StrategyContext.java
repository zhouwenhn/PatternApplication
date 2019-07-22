package jni.chowen.com.patternapplication.strategy_pattern;

/**
 * Created by zhouwen on 2019/7/13 17:17
 */
public class StrategyContext {
    private Strategy mStrategy;

    public StrategyContext(Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public void doing(){
        mStrategy.doing();
    }
}
