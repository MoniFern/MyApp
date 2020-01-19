package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button clickButtton;
    EditText inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButtton=findViewById(R.id.button_click);
        inputText=findViewById(R.id.name);


        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RISH", "OnClick listener work identify...");
                Log.d("RISH","OnClick"+inputText.getText().toString()); //input value eka locat ehen pennawa
                Intent intent=new Intent( MainActivity.this,SecondActivity.class); //kothanatada route wenne
                intent.putExtra("NAME",inputText.getText().toString());

                startActivity(intent);

            }
        };

        clickButtton.setOnClickListener(listener);
    }
}
