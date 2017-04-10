package com.example.ariel.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Main4Activity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void backToMain (View view){
        Intent intent = new Intent (this, MainMenu.class);
        startActivity(intent);
    }

    public void nextLocal (View view){
        Intent intent = new Intent (this, Main4Activity.class);
        startActivity(intent);
    }
}
