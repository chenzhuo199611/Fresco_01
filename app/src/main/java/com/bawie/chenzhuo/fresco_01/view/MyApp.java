package com.bawie.chenzhuo.fresco_01.view;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by asus on 2018/5/9.
 */

public class MyApp extends Application{
    private static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        Fresco.initialize(this);


    }
    public static MyApp getInstance(){
        return mInstance;
    };
}
