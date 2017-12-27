package com.lanshifu.myplugin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView mTv_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plugin);
        mTv_hello = (TextView) findViewById(R.id.tv_helloworld);
        String key = getIntent().getStringExtra("key");
        if (!TextUtils.isEmpty(key)) {
            Log.d(TAG, "onCreate: " + key);
            if (mTv_hello != null) {
                mTv_hello.setText(key);
            }
        }
        setTitle("插件标题");
        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "btn1: ");
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "btn2: ");
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "btn3: ");
            }
        });
    }

    public void clickHello(View view) {
        Log.d(TAG, "clickHello: ");
    }
}
