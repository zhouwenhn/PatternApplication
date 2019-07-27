package jni.chowen.com.patternapplication.component_pattern.company;


/**
 * Created by zhouwen on 2019/7/27 14:58
 */
public abstract class Company {
    protected String mName;

    public Company(String name) {
        mName = name;
    }

    public abstract void showHierarchy();

    public void add(Company component) {

    }

    public void remove(Company component) {

    }
}
