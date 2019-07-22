package jni.chowen.com.patternapplication.proxy;

/**
 * Created by zhouwen on 2019/7/10 21:53
 */
public class CustomerProxy implements Subject{

    private RealSubject mSubject;

    public CustomerProxy() {

    }

    @Override
    public void process() {
        preProcess();
        mSubject.process();
    }

    private void preProcess() {
        mSubject = new RealSubject();
    }
}
