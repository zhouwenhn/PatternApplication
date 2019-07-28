package jni.chowen.com.patternapplication.null_pattern;

/**
 * Created by zhouwen on 2019/7/28 10:15
 */
public class RosterClient {

    public void main() {
//        AbstractInterface customer1 = RosterFactory花名册.getCustomer(1);
//        customer1.callName();
//        AbstractInterface customer2 = RosterFactory花名册.getCustomer(2);
//        customer2.callName();
//        AbstractInterface customer3 = RosterFactory花名册.getCustomer(33);
//        customer3.callName();

        AbstractInterface customer;
        for (int i=0; i <36; i++){
            customer = RosterFactory花名册.getCustomer(i);
            customer.callName();
        }
    }
}
