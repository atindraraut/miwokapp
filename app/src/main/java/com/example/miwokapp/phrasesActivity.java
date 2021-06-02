package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<phrases> phrasesarray = new ArrayList<phrases>();
        phrasesarray.add(new phrases("where are you going?","minto wuksus",R.drawable.one));
        phrasesarray.add(new phrases("what is your name?" ,"tinnә oyaase'nә",R.drawable.two));
        phrasesarray.add(new phrases("my name is...","oyaaset...",R.drawable.three));
        phrasesarray.add(new phrases("how are you feeling?","michәksәs?",R.drawable.four));
        phrasesarray.add(new phrases("i'm feeling good.","kuchi achit",R.drawable.five));
        phrasesarray.add(new phrases("Are you coming?","әәnәs'aa?",R.drawable.six));
        phrasesarray.add(new phrases("Yes,I'm coming.","hәә’ әәnәm",R.drawable.seven));
        phrasesarray.add(new phrases("i'm coming.","әәnәm",R.drawable.eight));
        phrasesarray.add(new phrases("let's go.","yoowutis",R.drawable.eight));
        phrasesarray.add(new phrases("Come here.","әnni'nem",R.drawable.eight));


        phrasesadapter adapter=new phrasesadapter(this,phrasesarray);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}