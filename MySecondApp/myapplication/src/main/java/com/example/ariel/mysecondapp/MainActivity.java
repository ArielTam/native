package com.example.ariel.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.mysecondapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void passTraveler (View view){
        Intent intent = new Intent (this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    public void likeTraveler (View view){
        Intent intent = new Intent (this, Matched.class);
        startActivity(intent);
    }

    public void backToMain (View view){
        Intent intent = new Intent (this, MainMenu.class);
        startActivity(intent);
    }
}
