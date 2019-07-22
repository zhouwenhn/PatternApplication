package jni.chowen.com.patternapplication.TemplateModel;

/**
 * Created by zhouwen on 2019/7/9 21:52
 */
public class TemplateClient {

    public void test() {
        AbstractCoder codera = new CoderA();
        codera.schedule();

        AbstractCoder coderb = new CoderB();
        codera.schedule();
    }
}
