package jni.chowen.com.patternapplication;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by zhouwen on 2019/7/15 10:00
 */
public class AAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {//1
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
