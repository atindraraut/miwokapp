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
        familyArray.add(new family("father","әpә",R.drawable.family_father));
        familyArray.add(new family("mother","әṭa",R.drawable.family_mother));
        familyArray.add(new family("son","angsi",R.drawable.family_son));
        familyArray.add(new family("daughter","tune",R.drawable.family_daughter));
        familyArray.add(new family("older brother","taachi",R.drawable.family_older_brother));
        familyArray.add(new family("younger brother","chalitti",R.drawable.family_younger_brother));
        familyArray.add(new family("older sister","teṭe",R.drawable.family_older_sister));
        familyArray.add(new family("younger sister","kolliti",R.drawable.family_younger_sister));
        familyArray.add(new family("grandmother","ama",R.drawable.family_grandmother));
        familyArray.add(new family("grandfather","paapa",R.drawable.family_grandfather));


        familyadapter adapter = new familyadapter(this,familyArray);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}