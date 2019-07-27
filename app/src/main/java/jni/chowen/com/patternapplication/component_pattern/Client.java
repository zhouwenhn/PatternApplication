package jni.chowen.com.patternapplication.component_pattern;

/**
 * Created by zhouwen on 2019/7/27
 */
public class Client {
    public void test() {
        Component root = new Composite("root");

        Component branch = new Composite("branch");
        Component branch2 = new Composite("branch2");
        Component branch3 = new Composite("branch3");
        root.add(branch);
        root.add(branch2);
        branch2.add(branch3);

        Component leaf = new Leaf("leaf");
        branch.add(leaf);

        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        branch2.add(leaf2);
        branch2.add(leaf3);

        root.show();
    }
}
