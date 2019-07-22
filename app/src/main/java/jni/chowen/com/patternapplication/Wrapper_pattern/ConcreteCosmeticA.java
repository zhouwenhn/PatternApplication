package jni.chowen.com.patternapplication.Wrapper_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/12 09:19
 */
public class ConcreteCosmeticA extends CosmeticDecorator {


    public ConcreteCosmeticA(Costmeic costmeic) {
        super(costmeic);
    }

    @Override
    public void makeUp() {
        super.makeUp();
        heavyMakeup();
        rouge();
    }

    private void rouge() {
        Logger.getLogger("ConcreteCosmeticA").info("涂深红口红");
    }

    private void heavyMakeup() {
        Logger.getLogger("ConcreteCosmeticA").info("加浓妆");
    }


}
