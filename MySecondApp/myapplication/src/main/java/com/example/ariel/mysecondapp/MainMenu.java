package com.example.ariel.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar seekBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        seekBar3=(SeekBar)findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        Toast.makeText(getApplicationContext(),"distance from you: "+progress, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbar touch stopped!", Toast.LENGTH_SHORT).show();
    }

    public void pickLocaler (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void pickTraveler (View view){
        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent);
    }

}