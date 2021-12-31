package com.example.android98;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Bundle;

public class logoffreg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logoffreg);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                logoutmusic();

               finish();

            }
        }, 20000);
    }
    public void logoutmusic()
    {
        MediaPlayer player1 = MediaPlayer.create ( logoffreg.this , R.raw.logoff);
        player1.start();
    }
}