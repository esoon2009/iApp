package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ColourBlindTestLowRisk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test_low_risk);
    }

    protected void onClick_goToFindNearestOptometrist(View view){
        Intent myIntent = new Intent(this,NearestOptometrist.class);
        startActivity(myIntent);

    }
}
