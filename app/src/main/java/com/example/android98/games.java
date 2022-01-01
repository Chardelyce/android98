package com.example.android98;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class games extends AppCompatActivity {
    ImageButton button;
    DownloadManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        TextView textView=findViewById(R.id.date);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        SimpleDateFormat sdf = new SimpleDateFormat("KK:mm:ss aaa z ");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);
        button = findViewById(R.id.oom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //doom
            public void onClick(View view) {




                Intent launchIntent = getPackageManager ( ).getLaunchIntentForPackage ( "net.nullsum.freedoom" );
                if ( launchIntent != null ) {
                    startActivity ( launchIntent );
                }
                else {
                    Toast.makeText ( games.this ,
                            "Application is not installed directing to installation " , Toast.LENGTH_LONG
                    ).show ( );
                    Intent s = new Intent ( );
                    s.setAction ( Intent.ACTION_VIEW );
                    s.addCategory ( Intent.CATEGORY_BROWSABLE );
                    s.setData ( Uri.parse ( "https://download.apkpure.com/b/apk/bmV0Lm51bGxzdW0uZnJlZWRvb21fMTlfNDMyYWQ1NzA?_fn=RnJlZWRvb21fdjAuNC4yX2Fwa3B1cmUuY29tLmFwaw&as=0215efd511140f292ec7a74d4cfd27d461d065e7&ai=507234889&at=1641047407&_sa=ai%2Cat&k=60bc1c7bad98564392d0987770986e8461d3086f&r=https%3A%2F%2Fapkpure.com%2Ffreedoom%2Fnet.nullsum.freedoom&_p=bmV0Lm51bGxzdW0uZnJlZWRvb20&c=2%7CGAME_ACTION%7CZGV2PW1rcnVwY3phazMmdD1hcGsmcz0zNTQ5MDM4NSZ2bj0wLjQuMiZ2Yz0xOQ" ) );
                    startActivity ( s );
                }
            }
        });
        //minesweeper

        findViewById ( R.id.start).setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {

                Intent intent = new Intent ( games.this , loggedin.class );
                startActivity ( intent );

            }
        } );


    }
}