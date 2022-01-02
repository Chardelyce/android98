package com.example.android98;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class beourguest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beourguest);
        TextView textView=findViewById(R.id.date);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SimpleDateFormat sdf = new SimpleDateFormat("KK:mm:ss aaa z ");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);
        findViewById ( R.id.start).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( beourguest.this , programs.class );
                startActivity ( intent );

            }



        } );

    }

}