package com.example.googlerrefreash.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.googlerrefreash.R;

import java.util.Random;

import butterknife.BindView;

/**
 * Created by BigYoung on 2017/5/18.
 */

public class LoadingPager extends FrameLayout {
    private final Context mContext;
    @BindView(R.id.text_content)
    TextView mTextContent;

    public LoadingPager(Context context) {
        this(context, null);
    }

    public LoadingPager(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        LoadingPager.this.addView(LayoutInflater.from(context).inflate(R.layout.view_loading, null));
    }

    /**
     * 刷新view
     */
    public void refreashView() {
        double random=Math.random()*1000;
        mTextContent.setText(String.valueOf(random));
    }


}
