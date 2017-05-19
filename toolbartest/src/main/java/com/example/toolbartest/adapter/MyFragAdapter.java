package com.example.toolbartest.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by BigYoung on 2017/5/17.
 */

public class MyFragAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragList;

    public MyFragAdapter(FragmentManager fm) {
        super(fm);
    }

    public MyFragAdapter(FragmentManager fm, List<Fragment> fragList) {
        super(fm);
        mFragList = fragList;
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
