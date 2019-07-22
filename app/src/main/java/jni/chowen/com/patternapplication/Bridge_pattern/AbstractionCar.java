package jni.chowen.com.patternapplication.Bridge_pattern;

/**
 * Created by ZW on 2019/7/8 22:35
 */
public abstract class AbstractionCar {
    private Car mCar;

    public abstract void buildCar();

    public void setCar(Car car) {
        mCar = car;
    }

    public Car getCarIns(){
        return mCar;
    }
}
