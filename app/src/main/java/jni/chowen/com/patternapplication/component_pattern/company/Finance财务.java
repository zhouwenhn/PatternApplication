package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 15:05
 */
public class Finance财务 extends Company{
    public Finance财务(String name) {
        super(name);
    }

    @Override
    public void showHierarchy() {
        Logger.getLogger("Finance财务").info("Finance财务#name=" + mName);
    }
}
