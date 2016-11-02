package com.bawei.asus.lianxi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) this.findViewById(R.id.textview);

        float zoomScale = 0.5f;// 缩放比例
        new LianxiText(textView, zoomScale);
    }

}
