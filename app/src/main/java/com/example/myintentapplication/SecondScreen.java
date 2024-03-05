package com.example.myintentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {

    Button btnBackToMainScreen;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        btnBackToMainScreen = findViewById(R.id.btn_back_to_main_screen);

        btnBackToMainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
