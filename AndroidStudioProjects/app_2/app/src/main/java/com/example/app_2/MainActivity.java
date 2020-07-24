package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnact = (Button) findViewById(R.id.btn_act2);
        btnact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        Button act_ref = (Button) findViewById(R.id.act_refer);
        act_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                String s = editText.getText().toString();
                Intent x = new Intent(getApplicationContext(),Main3Activity.class);
                x.putExtra("com.example.app_2.something",s);
                startActivity(x);

            }
        });

        Button play_btn = (Button)findViewById(R.id.play_btn);
        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound);


                mediaPlayer.start();


                Button pause_btn = (Button)findViewById(R.id.pause_btn);
                pause_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPlayer.pause();
                    }
                });

            }
        });

        Button btn_google = (Button)findViewById(R.id.btn_google);
        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String google = "https://www.google.com";
                Uri webaddress = Uri.parse(google);
                Intent gotogoogle = new Intent( Intent.ACTION_VIEW,webaddress );
                if (gotogoogle.resolveActivity(getPackageManager()) != null ) {
                    startActivity(gotogoogle);
                }

            }
        });

    }
}
