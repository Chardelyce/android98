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

import android.os.Bundle;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
public class programs extends AppCompatActivity {
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        TextView textView=findViewById(R.id.date);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SimpleDateFormat sdf = new SimpleDateFormat("KK:mm:ss aaa z ");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);
//goes back to desktop from  programs

        findViewById ( R.id.start).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( programs.this , loggedin.class );
                startActivity ( intent );

            }

        } );
//starts the update intent

        findViewById ( R.id.uppers).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent s = new Intent ( );
                s.setAction ( Intent.ACTION_VIEW );
                s.addCategory ( Intent.CATEGORY_BROWSABLE );
                s.setData ( Uri.parse ( "https://github.com/Chardelyce/android98/releases" ) );
                startActivity ( s );
            }
        } );
        //starts ie
        findViewById ( R.id.globe).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent launchIntent = getPackageManager ( ).getLaunchIntentForPackage ( "com.sec.android.app.sbrowser" );
                if ( launchIntent != null ) {
                    startActivity ( launchIntent );
                }
                else {
                    Toast.makeText ( programs.this ,
                            "Application is not installed" , Toast.LENGTH_LONG
                    ).show ( );
                }

            }
        } );

        findViewById ( R.id.prompt).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent launchIntent = getPackageManager ( ).getLaunchIntentForPackage ( "com.paprbit.dcoder" );
                if ( launchIntent != null ) {
                    startActivity ( launchIntent );
                }
                else {
                    Toast.makeText ( programs.this ,
                            "Application is not installed directing to installation " , Toast.LENGTH_LONG
                    ).show ( );
                    Intent s = new Intent ( );
                    s.setAction ( Intent.ACTION_VIEW );
                    s.addCategory ( Intent.CATEGORY_BROWSABLE );
                    s.setData ( Uri.parse ( "https://www.apkmirror.com/apk/paprbit-technologies/dcoder-compiler-ide-code-programming-on-mobile-2/dcoder-compiler-ide-code-programming-on-mobile-2-4-0-105-release/dcoder-compiler-ide-code-programming-on-mobile-4-0-105-android-apk-download/download/" ) );
                    startActivity ( s );
                }


            }
        } );
        findViewById ( R.id.nono).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent intent = new Intent ( programs.this , notepad.class );
                startActivity ( intent );


            }
        } );
        //downloading office checks then downloads
        findViewById ( R.id.office).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent launchIntent = getPackageManager ( ).getLaunchIntentForPackage ( "com.microsoft.office.officehubrow" );
                if ( launchIntent != null ) {
                    startActivity ( launchIntent );
                }
                else {
                    Toast.makeText ( programs.this ,
                            "Application is not installed directing to installation " , Toast.LENGTH_LONG
                    ).show ( );
                    Intent s = new Intent ( );
                    s.setAction ( Intent.ACTION_VIEW );
                    s.addCategory ( Intent.CATEGORY_BROWSABLE );
                    s.setData ( Uri.parse ( "https://www.apkmirror.com/apk/microsoft-corporation/office-mobile-2/office-mobile-2-16-0-14729-20176-release/microsoft-office-edit-share-16-0-14729-20176-3-android-apk-download/download/" ) );
                    startActivity ( s );
                }
            //
            }
        } );
        findViewById ( R.id.hi).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent intent = new Intent ( programs.this , beourguest.class );
                startActivity ( intent );

                MediaPlayer player = MediaPlayer.create ( programs.this , R.raw.willfence);
                player.start();


            }
        } );



    }
}