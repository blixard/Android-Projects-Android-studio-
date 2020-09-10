package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class nextPage extends AppCompatActivity {
    private Button change_bt;
    private EditText cuser_et;
    private EditText cpass_et;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        change_bt = (Button)findViewById(R.id.change_bt);
        cuser_et = (EditText)findViewById(R.id.cuser_et);
        cpass_et = (EditText)findViewById(R.id.cpass_et);
        change_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.ruser=cuser_et.getText().toString();
                MainActivity.rpass=cpass_et.getText().toString();
            }
        });
    }
}