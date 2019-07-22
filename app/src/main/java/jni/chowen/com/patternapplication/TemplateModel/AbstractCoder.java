package jni.chowen.com.patternapplication.TemplateModel;

/**
 * Created by zhouwen on 2019/7/9 21:46
 * coder一天的日程为例
 */
public abstract class AbstractCoder {


    public abstract void eat();

    public abstract void work();

    public abstract void comeOffWork();

    public abstract void study();

    public abstract void sleep();


    public final void schedule(){
        eat();
        work();
        comeOffWork();
        study();
        sleep();
    }

}
