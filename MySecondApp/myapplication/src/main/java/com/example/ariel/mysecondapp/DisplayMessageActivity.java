package com.example.ariel.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.Main5Activity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void backToMain (View view){
        Intent intent = new Intent (this, MainMenu.class);
        startActivity(intent);
    }

    public void nextTraveler (View view){
        Intent intent = new Intent (this, Main5Activity.class);
        startActivity(intent);
    }
}
