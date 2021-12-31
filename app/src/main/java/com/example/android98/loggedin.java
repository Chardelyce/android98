package com.example.android98;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.Settings;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.TextView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.widget.Toast;

public class loggedin extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggedin);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //time and date
        TextView textView=findViewById(R.id.date);
        SimpleDateFormat sdf = new SimpleDateFormat("KK:mm:ss aaa z ");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);

        findViewById ( R.id.start).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( loggedin.this , startmenu.class );
                startActivity ( intent );

            }
        } );
        findViewById ( R.id.andy).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                startActivityForResult(new Intent(Settings.ACTION_SETTINGS), 0);
            }
        } );
        //settings
        findViewById ( R.id.wifisettings).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                //public static final String ACTION_WIFI_SETTINGS
                startActivityForResult(new Intent(Settings.ACTION_WIFI_SETTINGS), 0);
            }
        } );
        //docky
        findViewById ( R.id.docky).setOnClickListener ( new View.OnClickListener ( ) {
            private static final int PICK_PDF_FILE = 2;
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("application/pdf");
                startActivityForResult(intent,PICK_PDF_FILE);

            }
        } );
        //browser


        findViewById ( R.id.browbrow).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent launchIntent = getPackageManager ( ).getLaunchIntentForPackage ( "com.sec.android.app.sbrowser" );
                if ( launchIntent != null ) {
                    startActivity ( launchIntent );
                }
                else {
                    Toast.makeText ( loggedin.this ,
                            "Application is not installed" , Toast.LENGTH_LONG
                    ).show ( );
                }

            }
        } );
        //mail

        findViewById ( R.id. maily).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent launchIntent = getPackageManager ( ).getLaunchIntentForPackage ( "com.google.android.gm" );
                if ( launchIntent != null ) {
                    startActivity ( launchIntent );
                }
                else {
                    Toast.makeText ( loggedin.this ,
                            "Application is not installed" , Toast.LENGTH_LONG
                    ).show ( );
                }

            }
        } );

    }


}