package com.example.toolbartest.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toolbartest.widget.LoadingPager;

/**
 * Created by BigYoung on 2017/5/18.
 * 每一次可见时，修改loadingPager的内容
 */

public class NewsFragment extends Fragment {
    LoadingPager mLoadingPager;
    boolean mIsVisible;
    boolean mIsFirstVisible;
    boolean mIsFirstInVisible;
    ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(mLoadingPager==null) {
            mLoadingPager = new LoadingPager(getContext());
            mLoadingPager.refreashView();
        }
        return mLoadingPager;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        mIsVisible=isVisibleToUser;//刷型状态
        if(mLoadingPager==null)//if root view equals null,return
            return;
        if(mIsVisible){
            if(mIsFirstVisible){
                doAtFirstVisible();
                mIsFirstVisible=false;
            }else{
                doAtVisible();
            }
        }else{
            if (mIsFirstInVisible){
                doAtFirstInVisible();
                mIsFirstInVisible=false;
            }else{
                doAtInVisible();
            }
        }
    }

    /**
     * 可见时调用
     */
    public void doAtVisible(){
        mLoadingPager.refreashView();
    }

    /**
     * 第一次可见时
     */
    public void doAtFirstVisible(){
        doAtVisible();
    }

    /**
     * 第一次不可见
     */
    public void doAtFirstInVisible(){

    }

    /**
     * 不可见时调用
     */
    public void doAtInVisible(){

    }
}
