package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button add_btn = (Button) findViewById(R.id.add_btn);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView answer = (TextView) findViewById(R.id.answer);

                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());
                double result = x + y ;
                answer.setText(result + "");

            }
        });


        Button div_btn = (Button) findViewById(R.id.divide_btn);
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView answer = (TextView) findViewById(R.id.answer);

                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());
                double result = x / y ;
                answer.setText(result + "");

            }
        });


        Button subtract_btn = (Button) findViewById(R.id.subtract_btn);
        subtract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView answer = (TextView) findViewById(R.id.answer);

                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());
                double result = x - y ;
                answer.setText(result + "");

            }
        });


        Button multi_btn = (Button) findViewById(R.id.multiply_btn);
        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView answer = (TextView) findViewById(R.id.answer);

                double x = Double.parseDouble(num1.getText().toString());
                double y = Double.parseDouble(num2.getText().toString());
                double result = x * y ;
                answer.setText(result + "");

            }
        });


    }
}
