package com.example.toolbartest.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by BigYoung on 2017/5/17.
 */

public class MyStateFragAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragList;

    public MyStateFragAdapter(FragmentManager fm, List<Fragment> fragList) {
        super(fm);
        mFragList = fragList;
    }

    public MyStateFragAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragList.get(position);
    }

    @Override
    public int getCount() {
        if (mFragList != null) {
           return  mFragList.size();
        }
        return 0;
    }
}
