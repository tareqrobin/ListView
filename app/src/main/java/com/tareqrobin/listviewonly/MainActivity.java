package com.tareqrobin.listviewonly;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{

    private ListView simpleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String countryList[] = {"Bangladesh","Japan", "China", "Australia", "Portugal", "USA", "Argentina"};

        simpleList = (ListView)findViewById(R.id.simple);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}
