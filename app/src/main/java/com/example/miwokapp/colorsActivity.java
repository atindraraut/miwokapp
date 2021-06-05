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

        colorsarray.add(new colors("red","weṭeṭṭi",R.drawable.color_red));
        colorsarray.add(new colors("green","chokokki",R.drawable.color_green));
        colorsarray.add(new colors("brown","ṭakaakki",R.drawable.color_brown));
        colorsarray.add(new colors("gray","ṭopoppi",R.drawable.color_gray));
        colorsarray.add(new colors("black","kululli",R.drawable.color_black));
        colorsarray.add(new colors("white","kelelli",R.drawable.color_white));
        colorsarray.add(new colors("dusty yello","ṭopiisә",R.drawable.color_dusty_yellow));
        colorsarray.add(new colors("mustard yello","chiwiiṭә",R.drawable.color_mustard_yellow));



        coloradapter adapter = new coloradapter(this,colorsarray);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}