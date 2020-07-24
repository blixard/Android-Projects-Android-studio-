package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        if(getIntent().hasExtra("com.example.app_2.something")){
            TextView ref_text = (TextView)findViewById(R.id.ref_text);
            String s = getIntent().getExtras().getString("com.example.app_2.something");
            ref_text.setText(s);
        }



    }
}
