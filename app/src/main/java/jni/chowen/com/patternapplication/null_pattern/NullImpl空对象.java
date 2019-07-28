package jni.chowen.com.patternapplication.null_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/6/18 16:33
 */
public class NullImpl空对象 implements AbstractInterface {

    @Override
    public void callName() {
        Logger.getLogger("NullImpl空对象").info("null pointer!!");
    }
}
