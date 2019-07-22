package jni.chowen.com.patternapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.leakcanary.HeapDump;
import com.squareup.leakcanary.HeapDumper;
import com.squareup.leakcanary.LeakCanary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(1);

    }
}
