package jni.chowen.com.patternapplication.null_pattern;

/**
 * Created by zhouwen on 2019/6/18 16:39
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static BaseA getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new BaseAImpl();
            }
        }
        return new NullPattern();
    }


    void main(){
        BaseA customer1 = CustomerFactory.getCustomer("Rob");
        customer1.method();
        BaseA customer2 = CustomerFactory.getCustomer("Joe");
        customer2.method();
    }

}
