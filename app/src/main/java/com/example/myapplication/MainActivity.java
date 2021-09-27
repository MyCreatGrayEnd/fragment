package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestFragment fragment = new TestFragment();
        getFragmentManager().beginTransaction().replace(R.id.mframe, fragment).commitAllowingStateLoss();
    }
}