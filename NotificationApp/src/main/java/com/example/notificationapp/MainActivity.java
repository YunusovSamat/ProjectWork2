package com.example.notificationapp;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final int MY_NOTIFICATION_ID = 12345;
    private final int MY_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickSendNotification(View v) {
        NotificationCompat.Builder nBuild = new NotificationCompat.Builder(this);
        nBuild.setAutoCancel(true);

        nBuild.setSmallIcon(R.mipmap.ic_launcher_round);
        nBuild.setTicker(getString(R.string.textNotification));
        nBuild.setWhen(System.currentTimeMillis() + 10 * 1000);
        nBuild.setContentTitle(getString(R.string.titleNotification));
        nBuild.setContentText(getString(R.string.text2Notification));

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, MY_REQUEST_CODE,
                intent, PendingIntent.FLAG_UPDATE_CURRENT);
        nBuild.setContentIntent(pIntent);
        NotificationManager nService = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification n = nBuild.build();
        nService.notify(MY_NOTIFICATION_ID, n);
    }


    public void onClickSendNotification2(View v) {
        MyNewMessageNotification.notify(getApplicationContext(),
                "This is notification 2", 2);
    }
}
