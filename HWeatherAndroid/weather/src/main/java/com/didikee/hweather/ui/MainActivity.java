package com.didikee.hweather.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.didikee.hweather.R;
import com.didikee.hweather.network.HttpMethods;
import com.didikee.hweather.test.SamsungWeattherActivity;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SamsungWeattherActivity.class));
//                doTest();
            }
        });
    }

    private void doTest() {
        HttpMethods.getInstance().get7_10Weather("", new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                Log.e("test","s: "+s);
            }
        });
    }
}
