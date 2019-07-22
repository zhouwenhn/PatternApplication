package jni.chowen.com.patternapplication.Wrapper_pattern;

/**
 * Created by zhouwen on 2019/7/12 09:20
 */
public class WrapperClient {


    public void test(){

        Costmeic costmeic = new ConcreteCosmetic();

        ConcreteCosmeticA concreteCosmeticA = new ConcreteCosmeticA(costmeic);
        concreteCosmeticA.makeUp();

        ConcreteCosmeticB concreteCosmeticB = new ConcreteCosmeticB(costmeic);
        concreteCosmeticB.makeUp();

    }
}
