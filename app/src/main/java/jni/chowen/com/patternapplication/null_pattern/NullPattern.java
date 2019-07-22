package jni.chowen.com.patternapplication.null_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/6/18 16:33
 */
public class NullPattern implements BaseA {

    @Override
    public void method() {
        Logger.getLogger("NullPattern").info("null pointer!!");
    }
}
