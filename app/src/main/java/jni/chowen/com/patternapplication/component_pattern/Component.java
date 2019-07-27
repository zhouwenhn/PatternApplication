package jni.chowen.com.patternapplication.component_pattern;

/**
 * Created by zhouwen on 2019/7/27
 */
public abstract class Component {
    protected String mName;

    public Component(String name) {
        mName = name;
    }

    public abstract void show();

    public void add(Component component) {

    }

    public void remove(Component component) {

    }
}
