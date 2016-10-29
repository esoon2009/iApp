package com.example.user.iapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ColourBlindTestResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test_result);

        Bundle extras = getIntent().getExtras();
        int enterNumber1 = extras.getInt("editText1", 0);
        int enterNumber2 = extras.getInt("editText2",0);
        int enterNumber3 = extras.getInt("editText3",0);

        int result = enterNumber1 + enterNumber2 + enterNumber3;

        if (result < 3) {
            //Toast.makeText(this, "See your nearest optometrist " + enterNumber1 + " " + enterNumber2 + " "+ enterNumber3, Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this,ColourBlindTestFailed.class);
            startActivity(myIntent);
        }
        else {

        //Toast.makeText(this, "You do not have colour blindness! :) " + result, Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this,ColourBlindTestPassed.class);
            startActivity(myIntent);

        }



    }








}
