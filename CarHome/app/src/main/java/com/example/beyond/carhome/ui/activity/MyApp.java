package com.example.beyond.carhome.ui.activity;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Beyond on 2016/7/11.
 */
public class MyApp extends Application{
    private static Context context;
    private static SharedPreferences sp;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
