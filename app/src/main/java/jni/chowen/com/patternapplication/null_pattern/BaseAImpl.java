package jni.chowen.com.patternapplication.null_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/6/18 16:37
 */
public class BaseAImpl implements BaseA{
    @Override
    public void method() {
        Logger.getLogger("BaseAImpl").info("not null!!");
    }
}
