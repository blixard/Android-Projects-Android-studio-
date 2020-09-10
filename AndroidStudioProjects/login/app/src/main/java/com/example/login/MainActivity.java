package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button login_bt;
    private EditText user_et;
    private EditText pass_et;
    private TextView info_tv;
    private int count=0;
    public static String ruser="admin";
    public static String rpass="pass@1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_bt = (Button)findViewById(R.id.login_bt);
        user_et=(EditText)findViewById(R.id.user_et);
        pass_et = (EditText)findViewById(R.id.pass_et);
        login_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(user_et.getText().toString(),pass_et.getText().toString());
            }
        });
    }
    private void validate(String user, String pass){

        if(user.equals(ruser) && pass.equals(rpass)){
            Intent nextPage = new Intent(MainActivity.this ,nextPage.class);
            startActivity(nextPage);
        }
        else{
            count++;
            info_tv = (TextView)findViewById(R.id.info_tv);
            info_tv.setText("wrong password, attempt:  "+ String.valueOf(count));
        }
    }
}