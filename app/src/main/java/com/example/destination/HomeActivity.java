package com.example.destination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final TypeWriter tw = (TypeWriter) findViewById(R.id.home_title);
        tw.setText("");
        tw.animateText("Hi! I'm Sam, I will help you trough this trip, but a need to know YOU a little bit :) \nSo, can you say your name?");
    }
}