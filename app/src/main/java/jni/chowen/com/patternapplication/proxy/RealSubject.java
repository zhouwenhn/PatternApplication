package jni.chowen.com.patternapplication.proxy;


import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/10 21:52
 */
public class RealSubject implements Subject {
    @Override
    public void process() {
        Logger.getLogger("RealSubject").info("实际问题处理者");
    }
}
