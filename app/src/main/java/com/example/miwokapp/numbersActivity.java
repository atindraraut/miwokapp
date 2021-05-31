package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);

        ArrayList<String> numbersarray = new ArrayList<String>();
        numbersarray.add("one");
        numbersarray.add("two");
        numbersarray.add("three");
        numbersarray.add("four");
        numbersarray.add("five");
        numbersarray.add("six");
        numbersarray.add("seven");
        numbersarray.add("eight");
        numbersarray.add("nine");
        numbersarray.add("ten");

        int counter =0;
        while(0<numbersarray.size()){
            Log.i("numbersActivity", numbersarray.get(counter));
            LinearLayout mainview = (LinearLayout) findViewById(R.id.mainview);
            TextView subview= new TextView(this);
            subview.setText(numbersarray.get(counter));
            subview.setTextSize(32);
            mainview.addView(subview);
            counter++;

        }

    }
}