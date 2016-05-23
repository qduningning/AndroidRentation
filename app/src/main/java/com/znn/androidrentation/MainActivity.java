package com.znn.androidrentation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import com.znn.injectview.InjectView;
import com.znn.injectview.annotations.BindView;

public class MainActivity extends FragmentActivity {
    @BindView(R.id.text)
    TextView textView;
    @BindView(R.id.text2)
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectView.bind(this);
        textView.setText("text changged!");
    }
}
