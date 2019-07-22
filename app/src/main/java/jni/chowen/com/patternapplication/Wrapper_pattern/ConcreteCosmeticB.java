package jni.chowen.com.patternapplication.Wrapper_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/12 09:19
 */
public class ConcreteCosmeticB extends CosmeticDecorator {

    public ConcreteCosmeticB(Costmeic costmeic) {
        super(costmeic);
    }

    @Override
    public void makeUp() {
        super.makeUp();
        heavyMakeup();
        rouge();
    }
    private void rouge() {
        Logger.getLogger("ConcreteCosmeticB").info("涂淡红口红");
    }

    private void heavyMakeup() {
        Logger.getLogger("ConcreteCosmeticB").info("淡妆");
    }

}
