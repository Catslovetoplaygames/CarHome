package com.example.beyond.carhome.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by Beyond on 2016/7/11.
 * 基类
 */
public abstract class AbsBaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //设置了取消标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //绑定布局
        setContentView(setLayout());
        //初始化组件
        initViews();
        //初始化数据
        setDatas();
    }

    protected abstract int setLayout();

    protected abstract void initViews();

    protected abstract void setDatas();

    /**
     * 简化FindViewById
     */
    protected <T extends View>T byView(int resId){
        T t = (T) findViewById(resId);
        return t;
    }
    /**
     * 简化Intent跳转
     */
    protected void goTo(Context from,Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(from,to);
        startActivity(intent);
    }
    /**
     * 隐式Intent跳转
     */
    protected void goTo(String action,String uri){
        Intent intent = new Intent(action);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }
    /**
     * 带值跳转：需要携带Bundle
     * Bundle是一个轻量级存储数据的类，存储的形式Key—values
     */
    protected void goTo(Context from,Class<? extends AbsBaseActivity> to,Bundle values){
        Intent intent = new Intent(from,to);
        intent.putExtras(values);//传值们
        startActivity(intent);
    }
}
