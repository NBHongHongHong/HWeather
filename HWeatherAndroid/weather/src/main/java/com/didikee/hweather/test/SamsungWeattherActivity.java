package com.didikee.hweather.test;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.didikee.hweather.R;

public class SamsungWeattherActivity extends AppCompatActivity {

    private ImageView iv;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_weatther);

//        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
//        iv = (ImageView) findViewById(R.id.iv);
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
//        collapsingToolbarLayout.setTitle("测试");
//        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
//        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
//        iv.setImageResource(R.mipmap.ic_launcher);
    }
}
