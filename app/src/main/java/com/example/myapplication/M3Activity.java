package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class M3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);

        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "back";
                Toast toast = Toast.makeText(M3Activity.this, msg, Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(M3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        }
    }