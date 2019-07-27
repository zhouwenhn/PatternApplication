package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 15:05
 */
public class Admin行政 extends Company{
    @Override
    public void showHierarchy() {
        Logger.getLogger("Admin行政").info("Admin行政#name=" + mName);
    }

    public Admin行政(String name) {
        super(name);
    }
}
