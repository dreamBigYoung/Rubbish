package com.example.googlerrefreash;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.googlerrefreash.utils.MyApplication;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.conversation_rv)
    android.support.v7.widget.RecyclerView mConversationRv;
    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initEvent();
    }

    /**
     * 初始化化事件
     */
    private void initEvent() {
        //设置下拉进度条主题色
        mSwipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.honoko),getResources().getColor(R.color.kotori),getResources().getColor(R.color.eli),getResources().getColor(R.color.nozomi));
        //设置刷新触发的事件
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                MyApplication.getMainThreadHandler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //关闭刷新
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                },5000);
            }
        });
    }
}
