package jni.chowen.com.patternapplication.component_pattern.company;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 15:04
 */
public class HR人力 extends Company{
    public HR人力(String name) {
        super(name);
    }

    @Override
    public void showHierarchy() {
        Logger.getLogger("HR人力").info("HR人力#name=" + mName);
    }
}
