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
        setContentView(R.layout.activity_numbers);

        ArrayList<String> listofnumbers = new ArrayList<>();
        listofnumbers.add("one");
        listofnumbers.add("two");
        listofnumbers.add("three");
        listofnumbers.add("four");
        listofnumbers.add("five");
        listofnumbers.add("six");
        listofnumbers.add("seven");
        listofnumbers.add("eight");
        listofnumbers.add("nine");
        listofnumbers.add("ten");




        int index=0;
        while(index<listofnumbers.size()) {
            Log.i("numbersActivity", listofnumbers.get(index));
            LinearLayout rootView=(LinearLayout)findViewById(R.id.rootview);
            TextView wordView=new TextView(this);
            wordView.setText(listofnumbers.get(index));
            wordView.setTextSize(30);
            rootView.addView(wordView);
            index++;
        }
    }
}