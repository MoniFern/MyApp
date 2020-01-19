package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdActivity extends AppCompatActivity {
    String name[] = {"Monali", "Milan", "Haritha","Madu","Asanka"};
    String age[]={"23","20","25","24","60"};

    ListView listView;
    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView = findViewById(R.id.name_List);
        listView2 = findViewById(R.id.age_List);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, name);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text2, age);

        listView.setAdapter(adapter);
        listView2.setAdapter(adapter2);
    }
}
