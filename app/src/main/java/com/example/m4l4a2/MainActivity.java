package com.example.m4l4a2;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText et1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Activity2.class);
            startActivity(i);
        });

        b2.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Activity3.class);
            String str = et1.getText().toString();
            i.putExtra("STRING_I_NEED", str);
            startActivity(i);
        });

    }
}