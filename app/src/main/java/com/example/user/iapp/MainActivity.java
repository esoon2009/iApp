package com.example.user.iapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onClick_goToVisionTest(View view){
        Intent myIntent = new Intent(this,VisionTest.class);
        startActivity(myIntent);

    }

    protected void onClick_goToColourBlindTest(View view){
        Intent myIntent = new Intent(this,ColourBlindTestDescription.class);
        startActivity(myIntent);

    }

    protected void onClick_goToPerspectiveColourBlindTest(View view){
        Intent myIntent = new Intent(this,PerspectiveColourBlindTest.class);
        startActivity(myIntent);

    }


}
