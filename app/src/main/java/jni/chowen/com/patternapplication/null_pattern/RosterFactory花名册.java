package jni.chowen.com.patternapplication.null_pattern;


/**
 * Created by zhouwen on 2019/6/18 16:39
 */
public class RosterFactory花名册 {

    private static final int[] studentNums = {1, 2, 3,4,5,6,7,8};

    public static AbstractInterface getCustomer(int studentNum) {
        int length = studentNums.length;
        for (int i = 0; i < length; i++) {
            if (studentNums[i] == studentNum) {
                return new RosterImpl();
            }
        }
        return new NullImpl空对象();
    }


}
