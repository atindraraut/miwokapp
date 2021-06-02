package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numbersarray = new ArrayList<word>();

        numbersarray.add(new word("one","lutti",R.drawable.one));
        numbersarray.add(new word("two","otiiko",R.drawable.two));
        numbersarray.add(new word("three","tolookosu",R.drawable.three));
        numbersarray.add(new word("four","oyyisa",R.drawable.four));
        numbersarray.add(new word("five","mssokka",R.drawable.five));
        numbersarray.add(new word("six","temmokka",R.drawable.six));
        numbersarray.add(new word("seven","kenekaku",R.drawable.seven));
        numbersarray.add(new word("eight","kawinta",R.drawable.eight));
        numbersarray.add(new word("nine","wo'e",R.drawable.nine));
        numbersarray.add(new word("ten","na'aacha",R.drawable.ten));

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