package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText idtext;
    Button btntext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idtext = findViewById(R.id.idtext);
        btntext = findViewById(R.id.btntext);

        btntext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idtext.setText("안녕");
            }
        });

    }
}