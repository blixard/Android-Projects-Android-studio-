package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.sound);
        media.start();





        Button add_button = (Button) findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num1 = (EditText)findViewById(R.id.num1);
                EditText num2 = (EditText)findViewById(R.id.num2);
                TextView result = (TextView)findViewById(R.id.result);
                int x = Integer.parseInt(num1.getText().toString());
                int y = Integer.parseInt(num2.getText().toString());
                int sum = x+y;
                result.setText(sum+"");



            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");


    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }







    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}
