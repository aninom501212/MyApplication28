package com.rizaldi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rizaldi.mylibrary.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMath.Minus(1,5);
    }
}