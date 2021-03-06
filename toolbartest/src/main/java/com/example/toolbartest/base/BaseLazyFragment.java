package com.example.toolbartest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toolbartest.widget.LoadingPager;

/**
 * Created by BigYoung on 2017/5/18.
 */

public class BaseLazyFragment extends Fragment {
    boolean mIsVisible;
    boolean mIsFirstVisible;
    boolean mIsFirstInVisible;

    LoadingPager mLoadingPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
