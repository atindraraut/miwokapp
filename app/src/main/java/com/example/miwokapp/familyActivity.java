package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<family> familyArray= new ArrayList<family>();
        familyArray.add(new family("father","әpә",R.drawable.one));
        familyArray.add(new family("mother","әṭa",R.drawable.two));
        familyArray.add(new family("son","angsi",R.drawable.three));
        familyArray.add(new family("daughter","tune",R.drawable.four));
        familyArray.add(new family("older brother","taachi",R.drawable.five));
        familyArray.add(new family("younger brother","chalitti",R.drawable.six));
        familyArray.add(new family("older sister","teṭe",R.drawable.seven));
        familyArray.add(new family("younger sister","kolliti",R.drawable.eight));
        familyArray.add(new family("grandmother","ama",R.drawable.nine));
        familyArray.add(new family("grandfather","paapa",R.drawable.ten));


        familyadapter adapter = new familyadapter(this,familyArray);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}