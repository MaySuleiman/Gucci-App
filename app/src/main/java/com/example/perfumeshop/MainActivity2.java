package com.example.perfumeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void BackActivity1(View view){
        Intent intent= new Intent( this,MainActivity.class);
        startActivity(intent);
    }

    public void ToPruducts (View view){
        Intent intent= new Intent( this,MainActivity3.class);
        startActivity(intent);
}}