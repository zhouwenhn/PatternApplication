package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 15:05
 */
public class RD研发 extends Company{

    public RD研发(String name) {
        super(name);
    }

    @Override
    public void showHierarchy() {
        Logger.getLogger("RD研发").info("RD研发#name=" + mName);
    }
}
