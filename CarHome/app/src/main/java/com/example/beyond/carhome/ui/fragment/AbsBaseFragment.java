package com.example.beyond.carhome.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beyond.carhome.ui.activity.AbsBaseActivity;

/**
 * Created by Beyond on 2016/7/11.\
 * 基类
 */
public abstract class AbsBaseFragment extends Fragment{
    protected Context context;

    /**
     * 当Activity和Fragment关联时会被调用
     * 传入一个context给你使用
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(setLayout(),container,false);
    }

    protected abstract int setLayout();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
    protected abstract void initView();

    /**
     * 简化FindViewById
     */
    protected <T extends View>T byView(int resId){
        return (T) getView().findViewById(resId);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }
    protected abstract void initData();
    /**
     * Fragment跳转
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(context,to);
        context.startActivity(intent);
    }
}
