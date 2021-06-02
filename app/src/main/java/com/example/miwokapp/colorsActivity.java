package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<colors>colorsarray = new ArrayList<colors>();

        colorsarray.add(new colors("red","weṭeṭṭi",R.drawable.one));
        colorsarray.add(new colors("green","chokokki",R.drawable.two));
        colorsarray.add(new colors("brown","ṭakaakki",R.drawable.three));
        colorsarray.add(new colors("gray","ṭopoppi",R.drawable.four));
        colorsarray.add(new colors("black","kululli",R.drawable.five));
        colorsarray.add(new colors("white","kelelli",R.drawable.six));
        colorsarray.add(new colors("dusty yello","ṭopiisә",R.drawable.seven));
        colorsarray.add(new colors("mustard yello","chiwiiṭә",R.drawable.eight));



        coloradapter adapter = new coloradapter(this,colorsarray);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}