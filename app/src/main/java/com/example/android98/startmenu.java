package com.example.android98;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class startmenu extends AppCompatActivity {
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmenu);
        TextView textView=findViewById(R.id.date);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SimpleDateFormat sdf = new SimpleDateFormat("KK:mm:ss aaa z ");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);
//goes back to desktop from start menu

        findViewById ( R.id.start).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( startmenu.this , loggedin.class );
                startActivity ( intent );

            }
        } );

        //starts run
        findViewById ( R.id.fasting).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( startmenu.this , runrun.class );
                startActivity ( intent );

            }
        } );
//help menu

        findViewById ( R.id.helpy).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( startmenu.this , helpme.class );
                startActivity ( intent );
            }
        } );
        //settings
        findViewById ( R.id.oom).setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                startActivityForResult(new Intent(Settings.ACTION_SETTINGS), 0);

            }
        } );
//documents
        findViewById ( R.id.docky2).setOnClickListener ( new View.OnClickListener ( ) {
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
        //programs
        findViewById ( R.id.prog).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( startmenu.this , programs.class );
                startActivity ( intent );
            }
        } );
        //games
        findViewById ( R.id.gaga).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( startmenu.this , games.class );
                startActivity ( intent );
            }
        } );
        findViewById ( R.id.upup).setOnClickListener ( new View.OnClickListener ( ) {
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
        findViewById ( R.id.shutter).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {


                Intent intent = new Intent ( startmenu.this , logoffreg.class );
                startActivity ( intent );

                System.exit(0);
            }
        } );

    }


}