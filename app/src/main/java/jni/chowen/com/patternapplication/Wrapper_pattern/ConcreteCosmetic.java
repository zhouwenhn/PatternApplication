package jni.chowen.com.patternapplication.Wrapper_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/12 09:17
 */
public class ConcreteCosmetic extends Costmeic{
    @Override
    public void makeUp() {
        Logger.getLogger("ConcreteCosmetic").info("简单化妆");
    }
}
