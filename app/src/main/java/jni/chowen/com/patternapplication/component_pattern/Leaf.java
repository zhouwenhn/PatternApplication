package jni.chowen.com.patternapplication.component_pattern;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27
 *
 */
//树叶节点
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void show() {
        Logger.getLogger("Leaf").info("show#name=" + mName);
    }
}
