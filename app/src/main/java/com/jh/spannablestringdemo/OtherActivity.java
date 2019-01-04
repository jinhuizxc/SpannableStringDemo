package com.jh.spannablestringdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2019/1/4.
 */
public class OtherActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_other);

        TextView textView = (TextView) findViewById(R.id.text01);
        Intent intent = getIntent();
        if(intent != null) {
            Bundle bundle = intent.getBundleExtra("bundle");
            if(bundle != null) {
                String content = bundle.getString("content");
                textView.setText("这是传过来的内容：" + content);
            }
        }

    }
}
