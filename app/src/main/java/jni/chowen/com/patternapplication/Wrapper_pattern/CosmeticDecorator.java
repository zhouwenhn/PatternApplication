package jni.chowen.com.patternapplication.Wrapper_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/12 09:18
 */
public abstract class CosmeticDecorator extends Costmeic {

    private Costmeic mCostmeic;
    public CosmeticDecorator(Costmeic costmeic) {
        mCostmeic = costmeic;
    }

    @Override
    public void makeUp() {
        mCostmeic.makeUp();
    }
}
