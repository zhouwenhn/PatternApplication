package jni.chowen.com.patternapplication.strategy_pattern;

/**
 * Created by zhouwen on 2019/7/13 17:31
 */
public class StrategyClient {
    public void test(){
        Strategy strategya = new ConcreteStrategyA();
        Strategy strategyb = new ConcreteStrategyB();

        StrategyContext strategyContext = new StrategyContext(strategya);
        strategyContext.doing();

        strategyContext = new StrategyContext(strategyb);
        strategyContext.doing();
    }
}
