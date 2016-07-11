package com.example.beyond.carhome.tools;

/**
 * Created by Beyond on 2016/7/11.
 * Log的全局
 */
public class Log {
    public Log() {}
    //调试模式，目前定义true
    private static boolean isDebug = true;
    // Log的日志便签 定义的是应用名
    private static String TAG  = "MyDemo";


    public static void e(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }


    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }
}
