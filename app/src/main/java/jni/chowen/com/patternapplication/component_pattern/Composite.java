package jni.chowen.com.patternapplication.component_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/27 14:19
 */
//树枝节点
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void show() {
        Logger.getLogger("Composite").info("show#name=" + mName);
        for (Component component :
                components) {
            component.show();
        }
    }

    @Override
    public void add(Component component) {
        if (components.contains(component))
            components.add(component);
    }

    @Override
    public void remove(Component component) {
        if (components.contains(component))
            components.remove(component);
    }
}
