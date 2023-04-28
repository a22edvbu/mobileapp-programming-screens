package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTxt = findViewById(R.id.editText);

                Intent screenIntent = new Intent(MainActivity.this, SecondActivity.class);
                screenIntent.putExtra("input", editTxt.getText().toString()); // Optional
                startActivity(screenIntent);
            }
        });
    }
}
