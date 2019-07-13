package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonActivityB = findViewById(R.id.btnToActivityB);
        Button buttonActivityC = findViewById(R.id.btnToActivityC);

        buttonActivityB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);
            }
        });
        buttonActivityC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityC.class);
                startActivity(intent);
            }
        });
    }
}
