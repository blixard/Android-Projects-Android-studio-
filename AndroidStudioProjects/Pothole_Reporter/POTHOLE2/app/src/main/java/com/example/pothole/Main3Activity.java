package com.example.pothole;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Tag;

import java.util.HashMap;
import java.util.Map;

public class Main3Activity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




        RecyclerView report_list = (RecyclerView)findViewById(R.id.report_list);
        report_list.setLayoutManager(new LinearLayoutManager(this));
        String [] value = {"Shubha ","Abhinandan","Satya","Shruti","Rupel","Ayush","Abc","ASD","qwertyui","nighfury","Stellarhackers","Bruno mars","Hallo world","rama","Shyama"," rahul","Ari","Herculeus","ZebraMan",};

        report_list.setAdapter(new report_list_adapter(value));









    }


        }



