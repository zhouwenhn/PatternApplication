package jni.chowen.com.patternapplication.proxy;

/**
 * Created by zhouwen on 2019/7/10 21:54
 */
public class Client {
    public void test() {
        CustomerProxy customerProxy = new CustomerProxy();
        customerProxy.process();
    }
}
