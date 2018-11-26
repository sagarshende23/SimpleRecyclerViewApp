package com.manisterstudio.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList =(RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] Language = {"Java","JavaScript","C#","PHP","C","C++","Wrdpress","Computer","Mouse","Language","C#","PHP","C","C++","Wrdpress","Computer","Mouse","Language"};
        programmingList.setAdapter(new ProgammingAdapter(Language));
    }
}
