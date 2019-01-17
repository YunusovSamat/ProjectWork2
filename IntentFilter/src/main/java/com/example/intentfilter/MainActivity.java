package com.example.intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickShowTimeOrDate(View v) {
        intent= new Intent("my.action.showTimeOrDate");
        startActivity(intent);
    }


    public void onClickShowTime(View v) {
        intent = new Intent("my.action.showTime");
        startActivity(intent);
    }


    public void onClickShowDate(View v) {
        intent = new Intent("my.action.showDate");
        startActivity(intent);
    }
}
