package com.example.toolbartest.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.toolbartest.R;
import com.example.toolbartest.adapter.MyFragAdapter;
import com.example.toolbartest.adapter.MyStateFragAdapter;
import com.example.toolbartest.utils.MyToast;
import com.example.toolbartest.view.fragment.MyFragment;
import com.example.toolbartest.view.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by BigYoung on 2017/5/17.
 */

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.frg_vp)
    ViewPager mFrgVp;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        hideScrollerBar();
        setActionBar();
        setDrawerToggle();
        setListener();
        initView();
    }

    private void initView() {
        List<Fragment> frgList=new ArrayList<>();
        frgList.add(new MyFragment());
        frgList.add(new MyFragment());
        frgList.add(new MyFragment());
        frgList.add(new MyFragment());

        FragmentManager manager = getSupportFragmentManager();
        MyStateFragAdapter myAdapter=new MyStateFragAdapter(manager,frgList);
        //MyFragAdapter myAdapter=new MyFragAdapter(manager,frgList);
        mFrgVp.setAdapter(myAdapter);
    }

    /**
     * hide nevigation scroller bar
     */
    private void hideScrollerBar() {
        mNavigationView.getChildAt(0).setVerticalScrollBarEnabled(false);
        MyToast.show(null,null);
    }

    /*设置ActionBar*/
    private void setActionBar() {
        //setSupportActionBar(mToolbar);
        mToolbar.inflateMenu(R.menu.toolbar_find);
        /*显示Home图标*/
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /*设置Drawerlayout的开关,并且和Home图标联动*/
    private void setDrawerToggle() {
        toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, 0, 0);
        mDrawerLayout.addDrawerListener(toggle);
        /*同步drawerlayout的状态*/
        toggle.syncState();
    }

    /*设置监听器*/
    private void setListener() {
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_1:
                        MyToast.show(HomeActivity.this, "message");
                        break;
                    case R.id.item_2:
                        MyToast.show(HomeActivity.this, "what the fuck");
                        break;
                    case R.id.item_3:
                        break;
                    case R.id.single_1:
                        MyToast.show(HomeActivity.this, "single8883");



                        break;
                }
                mDrawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
