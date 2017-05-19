package com.example.toolbartest.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toolbartest.R;
import com.example.toolbartest.utils.LogUtils;

/**
 * Created by BigYoung on 2017/5/17.
 */

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LogUtils.d("what the fuck"+MyFragment.this.hashCode(),"the fucking is create");
        return inflater.inflate(R.layout.frag_myfrag, null, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
       // LogUtils.d("what the fuck","the fucking saveInstance");
    }

    @Override
    public void onPause() {
        super.onPause();
        //LogUtils.d("what the fuck","the fucking lose sight");
    }

    @Override
    public void onResume() {
        super.onResume();
        //LogUtils.d("what the fuck"+MyFragment.this.hashCode(),"the fucking getting sight");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //LogUtils.d("what the fuck","help me,help me,they want to kill me");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        LogUtils.d("what the fuck"+MyFragment.this.hashCode(),"it is setUserVisibleHint--"+isVisibleToUser);
    }
}
