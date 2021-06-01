package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);

        ArrayList<word> numbersarray = new ArrayList<word>();

        numbersarray.add(new word("one","lutti"));
        numbersarray.add(new word("two","otiiko"));
        numbersarray.add(new word("three","tolookosu"));
        numbersarray.add(new word("four","oyyisa"));
        numbersarray.add(new word("five","mssokka"));
        numbersarray.add(new word("six","temmokka"));
        numbersarray.add(new word("seven","kenekaku"));
        numbersarray.add(new word("eight","kawinta"));
        numbersarray.add(new word("nine","wo'e"));
        numbersarray.add(new word("ten","na'aacha"));

//        numbersarray.add("one");
//        numbersarray.add("two");
//        numbersarray.add("three");
//        numbersarray.add("four");
//        numbersarray.add("five");
//        numbersarray.add("six");
//        numbersarray.add("seven");
//        numbersarray.add("eight");
//        numbersarray.add("nine");
//        numbersarray.add("ten");

//        int counter =0;
//        while(counter<numbersarray.size()){
//            Log.i("numbersActivity", numbersarray.get(counter));
//            LinearLayout mainview = (LinearLayout) findViewById(R.id.mainview);
//            TextView subview= new TextView(this);
//            subview.setText(numbersarray.get(counter));
//            subview.setTextSize(32);
//            mainview.addView(subview);
//            counter++;
//        }
//        ArrayAdapter<word> itemsAdapter = new ArrayAdapter<word>(this,R.layout.list_item,numbersarray);
        WordAdapter aadapter= new WordAdapter(this,numbersarray);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(aadapter);

    }
}