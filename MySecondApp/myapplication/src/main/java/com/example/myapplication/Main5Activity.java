package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ariel.mysecondapp.MainMenu;
import com.example.ariel.mysecondapp.R;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void backToMain (View view){
        Intent intent = new Intent (this, MainMenu.class);
        startActivity(intent);
    }
}
