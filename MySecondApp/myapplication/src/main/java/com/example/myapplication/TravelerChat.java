package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ariel.mysecondapp.DisplayMessageActivity;
import com.example.ariel.mysecondapp.Main2Activity;
import com.example.ariel.mysecondapp.MainMenu;
import com.example.ariel.mysecondapp.R;

public class TravelerChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveler_chat);
    }

    public void nextTraveler (View view){
        Intent intent = new Intent (this, DisplayMessageActivity.class);
        startActivity(intent);
    }

}
