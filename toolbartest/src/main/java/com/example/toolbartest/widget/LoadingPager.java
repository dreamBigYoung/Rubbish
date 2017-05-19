package com.example.toolbartest.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.toolbartest.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by BigYoung on 2017/5/18.
 */

public class LoadingPager extends FrameLayout {
    private final Context mContext;
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
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_loading, null);
        mTextContent= ButterKnife.findById(inflate,R.id.text_content);
        LoadingPager.this.addView(inflate);
    }

    /**
     * 刷新view
     */
    public void refreashView() {
        double random = Math.random() * 1000;
        mTextContent.setText(String.valueOf(random));
    }


}
