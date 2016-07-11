package com.example.beyond.carhome.tools;

import android.widget.Toast;

import com.example.beyond.carhome.ui.activity.MyApp;

/**
 * Created by Beyond on 2016/7/11.
 */
public class Toa {
    private static boolean isDebug = true;

    //吐司的长时间
    public static void longMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
    //吐司的短时间
    public static void shortMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
}
