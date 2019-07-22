package jni.chowen.com.patternapplication.Bridge_pattern;

import java.util.logging.Logger;

/**
 * Created by ZW on 2019/7/8 22:34
 */
public class Truck implements Car{
    @Override
    public void buildCar() {
        Logger.getLogger("Truck").info("the car is truck");
    }
}
