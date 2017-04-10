package com.example.ariel.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.TravelerChat;

public class Matched extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matched);
    }

    public void goToChat (View view){
        Intent intent = new Intent (this, TravelerChat.class);
        startActivity(intent);
    }
}
