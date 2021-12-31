package com.example.android98;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //on launch of application play start up theme

//logging in
        findViewById ( R.id.defaultlogin).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( MainActivity.this , loggedin.class );
                startActivity ( intent );
                loginmusic();
            }
        } );

        findViewById ( R.id.cancelbutton).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( MainActivity.this , logoffreg.class );
                startActivity ( intent );
                logoutmusic();
            }
        } );
    }





public void loginmusic()
{
    MediaPlayer player = MediaPlayer.create ( MainActivity.this , R.raw.starty);
    player.start();
}
    public void logoutmusic()
    {
        MediaPlayer player1 = MediaPlayer.create ( MainActivity.this , R.raw.logoff);
        player1.start();
    }

}
