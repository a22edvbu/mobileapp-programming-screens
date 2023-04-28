package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle dataInput = getIntent().getExtras();
        if (dataInput != null) {
            String data = dataInput.getString("input");
            TextView output = findViewById(R.id.textView2);
            output.setText(data);
        }
    }
}