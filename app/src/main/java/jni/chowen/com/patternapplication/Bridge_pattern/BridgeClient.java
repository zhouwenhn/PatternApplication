package jni.chowen.com.patternapplication.Bridge_pattern;

/**
 * Created by ZW on 2019/7/8 22:37
 */
public class BridgeClient  {
    public void buildCar(){
        AbstractionCar abstractionCar = new RefinedAbstactionCar();

        abstractionCar.setCar(new Bus());
        abstractionCar.buildCar();

        abstractionCar.setCar(new Truck());
        abstractionCar.buildCar();
    }
}
