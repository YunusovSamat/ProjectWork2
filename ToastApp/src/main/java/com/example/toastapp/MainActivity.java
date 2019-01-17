package com.example.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }


    void showToast() {
        Toast toast = Toast.makeText(getApplicationContext(),
                getString(R.string.textToast), Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastLayout = (LinearLayout)toast.getView();
        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(R.mipmap.ic_launcher);
        toastLayout.addView(image, 0);
        toast.show();
    }
}
