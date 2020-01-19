package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    private static final String TAG ="SecondActivity";
    TextView name;
    TextView age;
    TextView contact;
    Button buttonProceed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        contact = findViewById(R.id.contact);
        buttonProceed=findViewById(R.id.btn_proceed);


        Log.d("RISH", "onCreate: " + getIntent().getExtras().get("NAME"));
        String nameValue = getIntent().getExtras().getString("NAME");
        name.setText("Name:" + nameValue);
        Log.d(TAG,"onCreate:");

        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent( SecondActivity.this, ThirdActivity.class); //kothanatada route wenne
                intent.putExtra("NAME",name.getText().toString());
                intent.putExtra("NAME",age.getText().toString());
                intent.putExtra("NAME",contact.getText().toString());

                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

}

