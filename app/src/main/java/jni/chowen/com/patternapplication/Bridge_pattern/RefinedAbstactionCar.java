package jni.chowen.com.patternapplication.Bridge_pattern;

/**
 * Created by ZW on 2019/7/8 22:46
 */
public class RefinedAbstactionCar extends AbstractionCar{
    @Override
    public void buildCar() {
        getCarIns().buildCar();
    }
}
